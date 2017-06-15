package br.com.addvisor.asynctask;

import android.os.AsyncTask;
import android.view.View;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Evaluate;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskCreateEvaluate extends AsyncTask<String, String, String[]> {
	
	private User user;
	private Service service;
	private Evaluate evaluate;
	private Message toast;

	public AsyncTaskCreateEvaluate(Service service, Evaluate evaluate, View view) {
		this.service = service;
		this.user = UserController.getInstance().getUser();
		this.evaluate = evaluate;
		this.toast = new Message(view.getContext());
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.addEvaluate(user, service, evaluate);
	}

	@Override
	protected void onPostExecute(String result[]) {
		super.onPostExecute(result);

		if (StatusRequest.sucess(result)) {
			toast.showToast("Avaliação registrada");
		} else if (StatusRequest.invalidRequest(result) || StatusRequest.failed(result)) {
			toast.showServerFail();
		} else {
			toast.showToast("Erro no servidor");
		}
	}
}
