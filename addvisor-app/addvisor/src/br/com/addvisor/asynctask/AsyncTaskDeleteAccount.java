package br.com.addvisor.asynctask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import br.com.addvisor.activities.LoginActivity;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Loading;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.User;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskDeleteAccount extends AsyncTask<String, String, String[]> {

	private User user;
	private Loading loadingView;
	private Message toast;
	private Context context;
	private Activity activity;

	public AsyncTaskDeleteAccount(User user, Activity activity) {
		this.user = user;
		this.context = activity.getApplicationContext();
		this.loadingView = new Loading(activity);
		this.toast = new Message(context);
		this.activity = activity;
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		loadingView.showInflate("Deletando sua conta ...");
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.removeUser(user);
	}

	@Override
	protected void onPostExecute(String result[]) {
		super.onPostExecute(result);

		if (StatusRequest.sucess(result)) {
			UserController.getInstance().setUser(null);
			startLoginActivity();
			toast.showToast("Conta deletada");

		} else if (StatusRequest.invalidRequest(result) || StatusRequest.failed(result)) {
			toast.showServerFail();
		} else {
			toast.showToast("Erro no servidor");
		}

		loadingView.stopInflate();
	}

	private void startLoginActivity() {
		Intent intent = new Intent(context, LoginActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(intent);
		activity.finish();
	}
}