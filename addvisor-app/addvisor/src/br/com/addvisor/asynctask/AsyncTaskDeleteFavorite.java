package br.com.addvisor.asynctask;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ListView;
import br.com.addvisor.R;
import br.com.addvisor.adapters.MyFavoritesAdapter;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.ServiceController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskDeleteFavorite extends
		AsyncTask<String, String, String[]> {

	private User user;
	private Service service;
	private Message toast;
	private Activity activity;
	private ServiceController serviceControl;

	public AsyncTaskDeleteFavorite(Service service, Activity activity) {
		this.service = service;
		this.activity = activity;
		this.user = UserController.getInstance().getUser();
		this.toast = new Message(activity.getApplicationContext());
		this.serviceControl = ServiceController.getInstance();
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.removeFavorite(user, service);
	}

	@Override
	protected void onPostExecute(String result[]) {
		super.onPostExecute(result);

		if (StatusRequest.sucess(result)) {
			serviceControl.getFavoriteLits().remove(service);
			updateListView();
			toast.showToast("Desfavoritado");
		} else if (StatusRequest.invalidRequest(result)
				|| StatusRequest.failed(result)) {
			toast.showServerFail();
		} else {
			toast.showToast("Erro no servidor");
		}
	}
	
	private void updateListView() {
		ListView listview = (ListView) activity.findViewById(R.id.listview_favoritos_services);
		listview.setAdapter(new MyFavoritesAdapter(activity, serviceControl.getFavoriteLits()));
	}
}
