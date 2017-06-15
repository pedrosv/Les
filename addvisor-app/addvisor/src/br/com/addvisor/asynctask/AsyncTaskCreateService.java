package br.com.addvisor.asynctask;

import android.app.Activity;
import android.os.AsyncTask;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Loading;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Service;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskCreateService extends AsyncTask<String, String, String[]> {

	private Service service;
	private Loading loadingView;
	private Message toast;
	private Activity activity;

	public AsyncTaskCreateService(Service service, Activity activity) {
		this.service = service;
		this.activity = activity;
		this.loadingView = new Loading(activity);
		this.toast = new Message(activity.getApplicationContext());
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		loadingView.showInflate("Adicionando novo serviço ...");
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.registerService(service);
	}

	@Override
	protected void onPostExecute(String result[]) {
		super.onPostExecute(result);

		if (StatusRequest.sucess(result)) {
			toast.showToast("Serviço adicionado");
			UserController.getInstance().save();
			activity.onBackPressed();
		} else if (StatusRequest.invalidRequest(result) || StatusRequest.failed(result)) {
			toast.showServerFail();
		} else {
			toast.showToast("Erro no servidor");
		}

		loadingView.stopInflate();
	}
}
