package br.com.addvisor.activities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.content.Intent;
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
import android.widget.Spinner;
import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskDeleteAccount;
import br.com.addvisor.asynctask.AsyncTaskUpdateAccount;
import br.com.addvisor.controller.LocationController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.City;
import br.com.addvisor.model.State;
import br.com.addvisor.model.User;
import br.com.addvisor.util.InternetConnection;

public class EditAccountActivity extends ActionBarActivity {

	private EditText etPhone;
	private Button buttonApply, buttonDelete, buttonChangePassword;
	private EditText etEmail;
	private EditText etName;
	private Message toast;

	private Spinner spinnerStates;
	private Spinner spinnerCities;
	private ArrayAdapter<String> adapterStates;
	private ArrayAdapter<String> adapterCities;

	private User user;
	private LocationController location;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_account);
		location = LocationController.getInstance();
		user = UserController.getInstance().getUser();

		toast = new Message(getApplicationContext());
		buttonApply = (Button) findViewById(R.id.button_apply);
		buttonDelete = (Button) findViewById(R.id.button_delete);
		buttonChangePassword = (Button) findViewById(R.id.button_edit_password);

		etPhone = (EditText) findViewById(R.id.edit_text_phone);
		etEmail = (EditText) findViewById(R.id.edit_text_email);
		etName = (EditText) findViewById(R.id.edit_text_name);
		
		buttonChangePassword.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent mainIntent = new Intent(getApplicationContext(), ChangePasswordActivity.class);
				startActivity(mainIntent);
			}
		});

		buttonApply.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				user = setFeaturesUser();
				InternetConnection internet = new InternetConnection(getApplicationContext());

				if (internet.isOnline()) {
					if (user != null) {
						AsyncTaskUpdateAccount request = new AsyncTaskUpdateAccount(user, EditAccountActivity.this);
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
					User user = UserController.getInstance().getUser();
					AsyncTaskDeleteAccount request = new AsyncTaskDeleteAccount(user, EditAccountActivity.this);
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

		spinnerCities = (Spinner) findViewById(R.id.spinner_cities_edit_user);
		spinnerStates = (Spinner) findViewById(R.id.spinner_states_edit_user);
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

		loadUserInformation();
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

	private User setFeaturesUser() {
		this.user = UserController.getInstance().getUser();
		
		if (isEmpty(etName) && isEmpty(etEmail) && isEmpty(etPhone)) {
			toast.showToast("Os campos nome, e-mail e telefone devem ser preenchidos");
			return null;
		}

		if (!isAValidEmail(etEmail.getText().toString())) {
			toast.showToast("E-mail inválido");
			return null;
		}

		if (etPhone.length() < 11) {
			toast.showToast("E-mail inválido");
			return null;
		}

		City city = location.getCitiesList().get(spinnerCities.getSelectedItemPosition());

		user.setName(etName.getText().toString());
		user.setEmail(etEmail.getText().toString());
		user.setPhone(getPhone());
		user.setCity(city);

		return user;
	}

	private String getPhone() {
		return etPhone.getText().toString();
	}

	private boolean isEmpty(EditText et) {
		return et.getText().toString().trim().isEmpty();
	}

	private void loadUserInformation() {
		etPhone.append(user.getPhone());
		etName.append(user.getName());
		etEmail.append(user.getEmail());
	}

	private boolean isAValidEmail(String email) {
		Pattern pattern;
		Matcher matcher;
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(email);
		return matcher.matches();

	}
}
