package br.com.addvisor.activities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import android.widget.Spinner;
import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskCreateAccount;
import br.com.addvisor.controller.LocationController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.City;
import br.com.addvisor.model.State;
import br.com.addvisor.model.User;
import br.com.addvisor.util.InternetConnection;

@SuppressLint("DefaultLocale")
public class CreateAccountActivity extends ActionBarActivity {

	private Button signUp;
	private EditText etCreatePassword, etConfirmPassword, etCreateEmail, etCreateName, etPhone;
	private EditText searchCities;

	private Spinner spinnerStates;
	private Spinner spinnerCities;
	private ArrayAdapter<String> adapterStates;
	private ArrayAdapter<String> adapterCities;

	private LocationController location;
	private User user;

	private Message toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_account);

		location = LocationController.getInstance();
		user = UserController.getInstance().getUser();

		toast = new Message(getApplicationContext());
		etCreatePassword = (EditText) findViewById(R.id.create_user_password);
		etConfirmPassword = (EditText) findViewById(R.id.create_user_confirm_password);
		etCreateEmail = (EditText) findViewById(R.id.create_user_email);
		etCreateName = (EditText) findViewById(R.id.create_user_name);
		etPhone = (EditText) findViewById(R.id.create_user_phone);

		signUp = (Button) findViewById(R.id.button_create_sing_up);
		signUp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				InternetConnection internet = new InternetConnection(getApplicationContext());

				if (internet.isOnline()) {
					if (fieldsAreFilled()) {
						registerUser();
					}
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

		spinnerCities = (Spinner) findViewById(R.id.spinner_cities_create_user);
		spinnerStates = (Spinner) findViewById(R.id.spinner_states_create_user);
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

	private void registerUser() {
		String name = etCreateName.getText().toString();
		String email = etCreateEmail.getText().toString();
		String password = etCreatePassword.getText().toString();
		String confirmPassword = etConfirmPassword.getText().toString();
		String phone = etPhone.getText().toString();
		City city = location.getCitiesList().get(spinnerCities.getSelectedItemPosition());

		if (!isAValidEmail(email)) {
			toast.showToast("E-mail inválido");
			return;
		}

		if (!fieldsAreFilled() || etPhone.length() < 11) {
			toast.showToast("Preencha todos os campos");
			toast.showToast("Telefone inválido");
			return;
		}

		if (password.length() < 6) {
			toast.showToast("Senha deve conter pelo menos 6 caracteres");
			return;
		}

		if (password.equals(confirmPassword)) {
			User newUser = new User(name, email, password, phone, city);
			AsyncTaskCreateAccount request = new AsyncTaskCreateAccount(newUser, CreateAccountActivity.this);
			request.execute();

		} else {
			toast.showToast("Senha não confere");
		}

	}

	private boolean fieldsAreFilled() {
		if (!isEmpty(etCreateName) && !isEmpty(etCreateEmail) && !isEmpty(etPhone) && !isEmpty(etCreatePassword) && !isEmpty(etConfirmPassword)) {
			return true;
		} else {
			toast.showToast("Preencha todos os campos");
			return false;
		}
	}

	private boolean isEmpty(EditText et) {
		return et.getText().toString().trim().isEmpty();
	}

	private boolean isAValidEmail(String email) {

		Pattern pattern;
		Matcher matcher;

		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		pattern = Pattern.compile(EMAIL_PATTERN);

		matcher = pattern.matcher(email);
		return matcher.matches();

	}

	private void initSearchEditText() {
		searchCities = (EditText) findViewById(R.id.search_cities_create_user);
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
