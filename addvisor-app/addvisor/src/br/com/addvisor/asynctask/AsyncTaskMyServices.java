package br.com.addvisor.asynctask;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.app.Activity;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.adapters.MyServicesAdapter;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Loading;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;
import br.com.addvisor.util.Constants;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskMyServices extends AsyncTask<String, String, String[]> {
	private User user;
	private Message toast;
	private Activity activity;
	private Loading loadingView;
	
	public AsyncTaskMyServices(Activity activity) {
		super();
		this.user = UserController.getInstance().getUser();
		this.activity = activity;
		this.toast = new Message(activity.getApplicationContext());
		this.loadingView = new Loading(activity);
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		loadingView.showInflate("Carregando ...");
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.getServiceByUser(user);
	}

	@Override
	protected void onPostExecute(String[] result) {
		super.onPostExecute(result);
		if (StatusRequest.sucess(result)) {
			try {
				showListview(getListServiceByJson(result[0]));
				loadingView.stopInflate();
			} catch (JSONException e) {
				showServicesNotFound();
				loadingView.stopInflate();
			}
		} else {
			loadingView.stopInflate();
			toast.showToast("Erro no servidor");
		}
	}

	private void showListview(List<Service> services) {
		ListView listview = (ListView) activity.findViewById(R.id.listview_user_services);
		listview.setAdapter(new MyServicesAdapter(activity.getApplicationContext(), services));
	}

	private List<Service> getListServiceByJson(String result) throws JSONException {
		JSONObject objectJson = new JSONObject(result);
		JSONArray arrayJson = objectJson.getJSONArray(Constants.SERVICE_TAG);
		Type listType = new TypeToken<ArrayList<Service>>() {
		}.getType();
		List<Service> services = new Gson().fromJson(arrayJson.toString(), listType);
		return services;
	}

	private void showServicesNotFound() {
		TextView tv = (TextView) activity.findViewById(R.id.textview_sem_servicos_usuario);
		ListView lv = (ListView) activity.findViewById(R.id.listview_user_services);
		lv.setVisibility(View.GONE);
		tv.setVisibility(View.VISIBLE);
	}
}
