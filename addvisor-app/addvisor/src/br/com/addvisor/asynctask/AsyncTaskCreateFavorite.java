package br.com.addvisor.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskCreateFavorite extends
		AsyncTask<String, String, String[]> {

	private User user;
	private Service service;
	private Message toast;

	public AsyncTaskCreateFavorite(Service service, Context context) {
		this.service = service;
		this.user = UserController.getInstance().getUser();
		this.toast = new Message(context);
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.addFavorite(user, service);
	}

	@Override
	protected void onPostExecute(String result[]) {
		super.onPostExecute(result);

		if (StatusRequest.sucess(result)) {
			toast.showToast("Favoritado");
		} else if (StatusRequest.invalidRequest(result)
				|| StatusRequest.failed(result)) {
			toast.showServerFail();
		} else {
			toast.showToast("Erro no servidor");
		}
	}
}
