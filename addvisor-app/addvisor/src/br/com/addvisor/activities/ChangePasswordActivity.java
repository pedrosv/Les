package br.com.addvisor.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskUpdatePassword;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.User;
import br.com.addvisor.util.InternetConnection;
import br.com.addvisor.util.PasswordCriptografy;

public class ChangePasswordActivity extends ActionBarActivity {

	private EditText etPassword, etNewPassword, etConfirmPassword;
	private Button buttonApply;
	private Message toast;
	private PasswordCriptografy criptografy;

	private String newPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_change_password);
		toast = new Message(getApplicationContext());
		criptografy = new PasswordCriptografy();

		etPassword = (EditText) findViewById(R.id.edit_password);
		etNewPassword = (EditText) findViewById(R.id.edit_new_password);
		etConfirmPassword = (EditText) findViewById(R.id.edit_confirm_passowrd);

		buttonApply = (Button) findViewById(R.id.button_change_password);
		buttonApply.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				saveNewPassword();
			}
		});
	}

	private void saveNewPassword() {
		if (fieldsAreFilled()) {
			resquest();
		}
	}

	private boolean setPassword() {
		String oldPassword = etPassword.getText().toString();
		String newPasswordTemp = etNewPassword.getText().toString();
		String confirmNewPassword = etConfirmPassword.getText().toString();

		if (newPasswordTemp.length() < 6) {
			toast.showToast("Senha deve conter pelo menos 6 caracteres");
			return false;
		}

		if (!newPasswordTemp.equals(confirmNewPassword)) {
			toast.showToast("Nova senha não confere");
			return false;
		}

		if (!checkPassword(oldPassword)) {
			toast.showToast("Sua senha esta incorreta");
			return false;
		}

		this.newPassword = criptografy.execute(newPasswordTemp);
		return true;
	}

	private void resquest() {
		InternetConnection internet = new InternetConnection(getApplicationContext());
		if (internet.isOnline() && setPassword()) {
			AsyncTaskUpdatePassword request = new AsyncTaskUpdatePassword(newPassword, ChangePasswordActivity.this);
			request.execute();
		} else {
			toast.showToast("Não foi possível alterar sua senha");
		}
	}

	private boolean fieldsAreFilled() {
		if (!isEmpty(etPassword) && !isEmpty(etNewPassword) && !isEmpty(etConfirmPassword)) {
			return true;
		} else {
			toast.showToast("Preencha todos os campos");
			return false;
		}
	}

	private boolean isEmpty(EditText et) {
		return et.getText().toString().trim().isEmpty();
	}

	private boolean checkPassword(String password) {
		User user = UserController.getInstance().getUser();

		if (criptografy.execute(password).equals(user.getPassword())) {
			return true;
		} else {
			toast.showToast("Senha não confere!");
			return false;
		}
	}
}
