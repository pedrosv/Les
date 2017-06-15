package br.com.addvisor.asynctask;

import br.com.addvisor.connection.Connection;
import br.com.addvisor.inflates.Loading;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Service;
import br.com.addvisor.util.StatusRequest;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;

public class AsyncTaskUpdateService extends AsyncTask<String, String, String[]> {

	private Service service;
	private Loading loadingView;
	private Message toast;
	private Activity activity;
	private Context context;

	public AsyncTaskUpdateService(Service service, Activity activity) {
		this.service = service;
		this.activity = activity;
		this.context = activity.getApplicationContext();
		this.loadingView = new Loading(activity);
		this.toast = new Message(context);
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		loadingView.showInflate("Atualizando...");
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.updateService(service);
	}

	@Override
	protected void onPostExecute(String[] result) {
		super.onPostExecute(result);

		if (StatusRequest.sucess(result)) {
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
