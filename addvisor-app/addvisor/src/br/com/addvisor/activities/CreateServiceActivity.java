package br.com.addvisor.activities;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskCreateService;
import br.com.addvisor.controller.LocationController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Loading;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Address;
import br.com.addvisor.model.City;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.State;
import br.com.addvisor.model.User;
import br.com.addvisor.model.enums.ServiceCat;
import br.com.addvisor.util.GeoLocationManager;
import br.com.addvisor.util.InternetConnection;

@SuppressLint("DefaultLocale")
public class CreateServiceActivity extends ActionBarActivity {

	private Button ConfirmButton;
	private ImageButton GetLocationButton;
	private User user;
	private LocationController location;
	private Message toast;

	private Spinner spinnerStates;
	private Spinner spinnerCities;
	private Spinner spinnerCategories;
	private ArrayAdapter<String> adapterStates;
	private ArrayAdapter<String> adapterCities;
	private ArrayAdapter<String> adapterCategories;

	private EditText etName, etDescription, etPhone, etTags;
	private EditText etAddress, etReference;
	private EditText searchCities;

	private boolean wasChangedByGPS = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_service);
		user = UserController.getInstance().getUser();
		location = LocationController.getInstance();
		toast = new Message(getApplicationContext());

		etName = (EditText) findViewById(R.id.create_service_name);
		etDescription = (EditText) findViewById(R.id.create_service_description);
		etTags = (EditText) findViewById(R.id.create_service_tags);

		etAddress = (EditText) findViewById(R.id.create_service_address);
		etAddress.addTextChangedListener(new TextWatcher() {

			public void afterTextChanged(Editable s) {
				wasChangedByGPS = false;
			}

			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			public void onTextChanged(CharSequence s, int start, int before, int count) {

			}
		});

		etReference = (EditText) findViewById(R.id.create_service_reference_address);

		etPhone = (EditText) findViewById(R.id.create_service_phone);
		etPhone.addTextChangedListener(new TextWatcher() {

			boolean backspace = false;
			int length = 0;

			private void appendSpace(EditText et) {
				String content = et.getText().toString();
				et.setText("");
				et.append(content + " ");
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {

			}

			@Override
			public void afterTextChanged(Editable s) {
				if (s.length() < length) {
					backspace = true;
				} else {
					backspace = false;
				}

				length = s.length();

				if (s.length() == 2 && !backspace) {
					appendSpace(etPhone);
				}
			}
		});

		GetLocationButton = (ImageButton) findViewById(R.id.get_location_button);
		GetLocationButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Loading loading = new Loading(CreateServiceActivity.this);
				loading.showInflate("Buscando sua localização ...");
				GeoLocationManager geoLocationManager = new GeoLocationManager(getApplicationContext());
				String address = geoLocationManager.getAddress();

				if (address != null) {
					loading.stopInflate();

					if (address == "Não foi possível obter a localização") {
						toast.showToast(address);
					} else {
						etAddress.setText(address);
						wasChangedByGPS = true;
					}
				}
			}
		});

		ConfirmButton = (Button) findViewById(R.id.button_create_service);
		ConfirmButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if (isValid()) {
					InternetConnection internet = new InternetConnection(getApplicationContext());

					if (internet.isOnline()) {
						registerService();
					} else {
						toast.showToast("Sem conexão com a internet");
					}

				} else {
					toast.showToast("Nome e telefone são obrigatórios");
					toast.showToast("Telefone inválido");
				}
			}
		});

		spinnerCities = (Spinner) findViewById(R.id.spinner_cities_create_service);
		spinnerCities.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				if (wasChangedByGPS) {
					etAddress.setText("");
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
			}
		});
		spinnerStates = (Spinner) findViewById(R.id.spinner_states_create_service);
		adapterStates = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, location.getStatesArray());
		spinnerStates.setAdapter(adapterStates);
		spinnerStates.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				updateSpinnerCities();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
			}
		});

		spinnerCategories = (Spinner) findViewById(R.id.spinner_categories_create_service);
		adapterCategories = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, ServiceCat.getValuesToString());
		spinnerCategories.setAdapter(adapterCategories);

		initSearchEditText();
		selectState();
		updateSpinnerCities();
	}

	private void updateSpinnerCities() {
		int position = spinnerStates.getSelectedItemPosition();
		State state = location.getStatesList().get(position);
		String[] cities = location.getCitiesToArray(state);

		adapterCities = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities);
		spinnerCities.setAdapter(adapterCities);
		selectCity();
	}

	private void selectState() {
		if (user != null && user.getCity().getState() != null) {
			int index = location.getStatesList().indexOf(user.getCity().getState());
			spinnerStates.setSelection(index);
		}
	}

	private void selectCity() {
		if (user != null && user.getCity() != null) {
			int index = location.getCitiesList().indexOf(user.getCity());
			spinnerCities.setSelection(index);
		}
	}

	private void registerService() {
		AsyncTaskCreateService request = new AsyncTaskCreateService(createService(), CreateServiceActivity.this);
		request.execute();
	}

	private String getPhone() {
		return etPhone.getText().toString();
	}

	private Service createService() {
		String name = etName.getText().toString();
		String description = etDescription.getText().toString();
		String tags = etTags.getText().toString();

		String addressText = etAddress.getText().toString();
		String reference = etReference.getText().toString();

		City city = location.getCitiesList().get(spinnerCities.getSelectedItemPosition());
		ServiceCat category = ServiceCat.getCategories()[spinnerCategories.getSelectedItemPosition()];

		Service newService = new Service();
		newService.setName(name);
		newService.setDescription(description);
		newService.setCategory(category);
		newService.setTags(tags);
		newService.setMedia(0f);

		List<String> phones = new ArrayList<String>();
		phones.add(getPhone());
		// phones.add(user.getPhone());
		newService.setPhones(phones);

		Address address = new Address();
		address.setLocation(addressText);
		address.setComplement(reference);
		address.setCity(city);

		newService.setAddress(address);
		newService.setUser(user);

		return newService;
	}

	private boolean isValid() {
		if (isEmpty(etName) || isEmpty(etPhone) || etPhone.length() < 11) {
			return false;
		}
		return true;
	}

	private boolean isEmpty(EditText et) {
		return et.getText().toString().isEmpty();
	}

	private void initSearchEditText() {
		searchCities = (EditText) findViewById(R.id.search_cities_create_service);
		searchCities.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				searchInSpinner(s.toString());
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {

			}

			@Override
			public void afterTextChanged(Editable s) {

			}
		});
	}

	private void searchInSpinner(String text) {
		int position = spinnerStates.getSelectedItemPosition();
		State state = location.getStatesList().get(position);
		String[] cities = location.getCitiesToArray(state);

		for (int i = 0; i < cities.length; i++) {
			if (cities[i].toLowerCase().trim().contains(text.toLowerCase().trim())) {
				spinnerCities.setSelection(i, true);
				break;
			}
		}
	}
}
