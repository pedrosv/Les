package br.com.addvisor.activities;

import java.util.ArrayList;
import java.util.List;

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
import br.com.addvisor.asynctask.AsyncTaskDeleteService;
import br.com.addvisor.asynctask.AsyncTaskUpdateService;
import br.com.addvisor.controller.LocationController;
import br.com.addvisor.controller.ServiceController;
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

public class EditServiceActivity extends ActionBarActivity {

	private ImageButton GetLocationButton;
	private Button buttonApply, buttonDelete;
	private Spinner spinnerStates;
	private Spinner spinnerCities;
	private Spinner spinnerCategories;
	private ArrayAdapter<String> adapterStates;
	private ArrayAdapter<String> adapterCities;
	private ArrayAdapter<String> adapterCategories;
	private Message toast;

	private EditText etName, etDescription, etPhone, etTags;
	private EditText etAddress, etReference;

	private User user;
	private Service service;
	private LocationController location;
	
	private boolean wasChangedByGPS = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_service);

		user = UserController.getInstance().getUser();
		service = ServiceController.getInstance().getServiceToEdit();
		location = LocationController.getInstance();

		toast = new Message(getApplicationContext());
		buttonApply = (Button) findViewById(R.id.button_apply);
		buttonDelete = (Button) findViewById(R.id.button_delete);

		etTags = (EditText) findViewById(R.id.edit_text_tags);
		etPhone = (EditText) findViewById(R.id.edit_text_main_phone);
		etName = (EditText) findViewById(R.id.edit_text_name);
		etAddress = (EditText) findViewById(R.id.edit_service_address);
		etAddress.addTextChangedListener(new TextWatcher() {
			 
			   public void afterTextChanged(Editable s) {
				   wasChangedByGPS = false;
			   }
			 
			   public void beforeTextChanged(CharSequence s, int start, 
			     int count, int after) {
			   }
			 
			   public void onTextChanged(CharSequence s, int start, int before, int count) {
			   
			   }
			  });
		
		etDescription = (EditText) findViewById(R.id.edit_text_description);
		etReference = (EditText) findViewById(R.id.edit_service_reference_address);
		
		GetLocationButton = (ImageButton) findViewById(R.id.get_location_button);
		GetLocationButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Loading loading = new Loading(EditServiceActivity.this);
				loading.showInflate("Buscando sua localização ...");
				GeoLocationManager geoLocationManager = new GeoLocationManager(getApplicationContext());
				String address = geoLocationManager.getAddress();
				if(address != "Não foi possível obter a localização"){
					etAddress.setText(address);
					wasChangedByGPS = true;
				}			
				loading.stopInflate();
			}
		});

		buttonApply.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				service = setFeaturesService(service);
				InternetConnection internet = new InternetConnection(getApplicationContext());

				if (internet.isOnline()) {
					if (service != null) {
						AsyncTaskUpdateService request = new AsyncTaskUpdateService(service, EditServiceActivity.this);
						request.execute();
					}
				} else {
					toast.showToast("Sem conexão com a internet");
				}
			}
		});

		buttonDelete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				InternetConnection internet = new InternetConnection(getApplicationContext());

				if (internet.isOnline()) {
					AsyncTaskDeleteService request = new AsyncTaskDeleteService(service, EditServiceActivity.this);
					request.execute();

				} else {
					toast.showToast("Sem conexão com a internet");
				}
			}
		});

		etPhone.addTextChangedListener(new TextWatcher() {
			boolean backspace = false;
			int length = etPhone.getText().toString().length();

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

		spinnerCities = (Spinner) findViewById(R.id.spinner_cities_edit_service);
		spinnerCities.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				if(wasChangedByGPS){
					etAddress.setText("");
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
			}
		});	
		
		spinnerStates = (Spinner) findViewById(R.id.spinner_states_edit_service);
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

		spinnerCategories = (Spinner) findViewById(R.id.spinner_categories_edit_service);
		adapterCategories = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, ServiceCat.getValuesToString());
		spinnerCategories.setAdapter(adapterCategories);

		loadServiceInformation();
		selectState();
		updateSpinnerCities();
		updateSpinnerCategories();
	}

	private void updateSpinnerCities() {
		int position = spinnerStates.getSelectedItemPosition();
		State state = location.getStatesList().get(position);
		String[] cities = location.getCitiesToArray(state);

		adapterCities = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities);
		spinnerCities.setAdapter(adapterCities);
		selectCity();
	}

	private void updateSpinnerCategories() {
		String currentCategory = service.getCategory().getValue();
		String[] categories = ServiceCat.getValuesToString();

		for (int i = 0; i < categories.length; i++) {
			if (currentCategory.trim().equals(categories[i].trim())) {
				spinnerCategories.setSelection(i);
				break;
			}
		}

	}

	private void selectState() {
		if (service != null && service.getAddress().getCity().getState() != null) {
			int index = location.getStatesList().indexOf(service.getAddress().getCity().getState());
			spinnerStates.setSelection(index);
		}
	}

	private void selectCity() {
		if (service != null && service.getAddress().getCity() != null) {
			int index = location.getCitiesList().indexOf(service.getAddress().getCity());
			spinnerCities.setSelection(index);
		}
	}

	private void loadServiceInformation() {
		etPhone.append(service.getPhones().get(0));
		etName.append(service.getName());
		etTags.append(service.getTags());
		etDescription.append(service.getDescription());
		etAddress.append(service.getAddress().getLocation());
		etReference.append(service.getAddress().getComplement());
	}

	private String getPhone() {
		return etPhone.getText().toString();
	}

	private Service setFeaturesService(Service service) {
		if (isEmpty(etName) && isEmpty(etPhone)) {
			toast.showToast("Os campos nome e telefone devem ser preenchidos");
			return null;
		}

		if (etPhone.length() < 11) {
			toast.showToast("Telefone inválido");
			return null;
		}

		City city = location.getCitiesList().get(spinnerCities.getSelectedItemPosition());
		ServiceCat category = ServiceCat.getCategories()[spinnerCategories.getSelectedItemPosition()];

		Address address = new Address();
		address.setCity(city);
		address.setComplement(etReference.getText().toString());
		address.setLocation(etAddress.getText().toString());

		service.setCategory(category);
		service.setAddress(address);
		service.setName(etName.getText().toString());
		service.setDescription(etDescription.getText().toString());
		service.setTags(etTags.getText().toString());

		List<String> phones = new ArrayList<String>();
		phones.add(getPhone());
		phones.add(user.getPhone());
		service.setPhones(phones);

		return service;
	}

	private boolean isEmpty(EditText et) {
		return et.getText().toString().isEmpty();
	}
}
