package br.com.addvisor.inflates;

import br.com.addvisor.R;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.controller.LocationController;
import br.com.addvisor.model.City;
import br.com.addvisor.model.State;
import br.com.addvisor.model.User;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

@SuppressLint("DefaultLocale")
public class Location {

	private User user;
	private LocationController location;
	private AlertDialog alertDialog;
	private Activity activity;
	private Context context;

	private Spinner spinnerCities;
	private Spinner spinnerStates;
	private ArrayAdapter<String> adapterStates;
	private ArrayAdapter<String> adapterCities;
	private EditText searchCities;

	public Location(Activity activity) {
		this.activity = activity;
		this.context = activity.getApplicationContext();
		this.user = UserController.getInstance().getUser();
		this.location = LocationController.getInstance();
	}

	@SuppressLint("InflateParams")
	public void inflate() {
		LayoutInflater factory = LayoutInflater.from(activity);
		final View viewInflate = factory.inflate(R.layout.activity_location, null);
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setView(viewInflate);

		initSpinner(viewInflate);
		initSearchEditText(viewInflate);
		selectState();
		updateSpinnerCities();

		builder.setNegativeButton(context.getResources().getString(R.string.cancel_captalize), new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		});

		builder.setPositiveButton(context.getResources().getString(R.string.save_captalize), new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				saveLocation();
			}

			private void saveLocation() {
				City city = location.getCitiesList().get(spinnerCities.getSelectedItemPosition());
				user.setCity(city);
				UserController.getInstance().save();
			}
		});

		alertDialog = builder.create();
		alertDialog.show();
	}

	private void initSpinner(View view) {
		String[] states = location.getStatesArray();

		spinnerCities = (Spinner) view.findViewById(R.id.spinner_cities_location);
		spinnerStates = (Spinner) view.findViewById(R.id.spinner_states_location);
		adapterStates = new ArrayAdapter<String>(activity, R.layout.support_simple_spinner_dropdown_item, states);
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
	}

	private void updateSpinnerCities() {
		int position = spinnerStates.getSelectedItemPosition();
		State state = location.getStatesList().get(position);
		String[] cities = location.getCitiesToArray(state);

		adapterCities = new ArrayAdapter<String>(activity, R.layout.support_simple_spinner_dropdown_item, cities);
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

	private void initSearchEditText(View view) {
		searchCities = (EditText) view.findViewById(R.id.search_cities);
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
