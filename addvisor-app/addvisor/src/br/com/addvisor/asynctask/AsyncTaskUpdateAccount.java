package br.com.addvisor.asynctask;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Loading;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.User;
import br.com.addvisor.util.Converter;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskUpdateAccount extends AsyncTask<String, String, String[]> {

	private User user;
	private Loading loadingView;
	private Message toast;
	private Context context;
	private Activity activity;

	public AsyncTaskUpdateAccount(User user, Activity activity) {
		this.user = user;
		this.context = activity.getApplicationContext();
		this.loadingView = new Loading(activity);
		this.toast = new Message(context);
		this.activity = activity;
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		loadingView.showInflate("Atualizando...");
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.updateUser(user);
	}

	@Override
	protected void onPostExecute(String[] result) {
		super.onPostExecute(result);

		if (StatusRequest.sucess(result)) {
			User newUser = Converter.getUserInstance(result[0]);
			UserController.getInstance().setUser(newUser);
			toast.showToast("Atualizado");
			activity.onBackPressed();
		} else if (StatusRequest.invalidRequest(result)) {
			toast.showInvalidAuthentication();
		} else if (StatusRequest.failed(result)) {
			toast.showServerFail();
		} else {
			toast.showToast("Erro no servidor");
		}

		loadingView.stopInflate();
	}
}