package br.com.addvisor.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskLogin;
import br.com.addvisor.controller.LocationController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.User;
import br.com.addvisor.util.InternetConnection;

public class LoginActivity extends ActionBarActivity {

	private TextView signUp;
	private Button signIn;
	private EditText etPhone, etPassword;
	private Message toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		toast = new Message(getApplicationContext());
		etPassword = (EditText) findViewById(R.id.edit_text_password);
		etPhone = (EditText) findViewById(R.id.edit_text_phone);
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

		signUp = (TextView) findViewById(R.id.text_button_cadastrar);
		signUp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), CreateAccountActivity.class);
				startActivity(intent);
			}
		});

		signIn = (Button) findViewById(R.id.button_entrar_login);
		signIn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				requestLogin();
			}
		});
	}

	@Override
	public void onBackPressed() {
		dispose();
		finish();
	}

	private void requestLogin() {
		InternetConnection internet = new InternetConnection(getApplicationContext());
		if (internet.isOnline()) {
			singIn();
		} else {
			toast.showNoInternetConnection();
		}
	}

	private void singIn() {
		if (isValid()) {
			User user = new User(getPhone(), getPassword());

			AsyncTaskLogin request = new AsyncTaskLogin(user, LoginActivity.this);
			request.execute();
		} else {
			toast.showFillAllFields();
		}
	}

	private String getPassword() {
		return etPassword.getText().toString();
	}

	private String getPhone() {
		return etPhone.getText().toString();
	}

	private boolean isValid() {
		return !isEmpty(etPhone) && !isEmpty(etPassword) && etPhone.length() > 10;
	}

	private boolean isEmpty(EditText et) {
		return et.getText().toString().trim().isEmpty();
	}

	private void dispose() {
		LocationController.getInstance().dispose();
		UserController.getInstance().dispose();
	}
}
