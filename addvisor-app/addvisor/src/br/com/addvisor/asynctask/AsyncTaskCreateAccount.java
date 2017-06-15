package br.com.addvisor.asynctask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import br.com.addvisor.activities.MainActivity;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Loading;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.User;
import br.com.addvisor.util.Converter;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskCreateAccount extends AsyncTask<String, String, String[]> {

	private User user;
	private Loading loading;
	private Message toast;
	private Context context;
	private Activity activity;

	public AsyncTaskCreateAccount(User user, Activity activity) {
		this.user = user;
		this.context = activity.getApplicationContext();
		this.loading = new Loading(activity);
		this.toast = new Message(context);
		this.activity = activity;
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		loading.showInflate("Criando sua conta ...");
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.registerUser(user);
	}

	@Override
	protected void onPostExecute(String[] result) {
		super.onPostExecute(result);
		if (StatusRequest.sucess(result)) {
			User user = Converter.getUserInstance(result[0]);
			UserController.getInstance().setUser(user);
			startMainActivity();
			toast.showToast("Conta criada");

		} else if (StatusRequest.invalidRequest(result)) {
			toast.showPhoneAlreadyExists();
		} else if (StatusRequest.failed(result)) {
			toast.showServerFail();
		} else {
			toast.showToast("Erro no servidor");
		}

		loading.stopInflate();
	}

	private void startMainActivity() {
		Intent intent = new Intent(context, MainActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(intent);
		activity.finish();
	}
}
