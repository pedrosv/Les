package br.com.addvisor.asynctask;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Loading;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.User;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskUpdatePassword extends AsyncTask<String, String, String[]> {

	private User user;
	private Loading loadingView;
	private Message toast;
	private Context context;
	private Activity activity;
	private String newPassword;

	public AsyncTaskUpdatePassword(String newPassword, Activity activity) {
		this.newPassword = newPassword;
		this.context = activity.getApplicationContext();
		this.loadingView = new Loading(activity);
		this.toast = new Message(context);
		this.activity = activity;
		this.user = UserController.getInstance().getUser();
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		loadingView.showInflate("Atualizando...");
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.updatePassword(user, newPassword);
	}

	@Override
	protected void onPostExecute(String[] result) {
		super.onPostExecute(result);

		if (StatusRequest.sucess(result)) {
			user.setPassword(newPassword);
			UserController.getInstance().setUser(user);
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