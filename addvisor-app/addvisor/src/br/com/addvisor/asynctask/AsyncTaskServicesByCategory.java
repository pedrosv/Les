package br.com.addvisor.asynctask;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import br.com.addvisor.adapters.ServiceAdapter;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.ServiceController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.City;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.enums.ServiceCat;
import br.com.addvisor.util.Constants;
import br.com.addvisor.util.StatusRequest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class AsyncTaskServicesByCategory extends AsyncTask<String, String, String[]> {

	private Message toast;
	private View view;
	private City city;
	private ServiceCat category;
	private ListView listview;
	private TextView textview;

	public AsyncTaskServicesByCategory(ServiceCat category, City city, ListView listview, TextView textview, View view) {
		super();
		this.view = view;
		this.toast = new Message(view.getContext());
		this.category = category;
		this.city = city;
		this.listview = listview;
		this.textview = textview;
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.getServiceByCategory(category, city);
	}

	@Override
	protected void onPostExecute(String[] result) {
		super.onPostExecute(result);

		if (StatusRequest.sucess(result)) {
			try {
				showListview(getListServiceByJson(result[0]));
			} catch (JSONException e) {
				showServicesNotFound();
			}
		} else {
			toast.showToast("Erro no servidor");
		}
	}

	private void showListview(List<Service> services) {
		ServiceController serviceController = ServiceController.getInstance();
		serviceController.getCache().put(category, services);
		listview.setAdapter(new ServiceAdapter(view.getContext(), services));
	}

	private List<Service> getListServiceByJson(String result) throws JSONException {
		JSONObject objectJson = new JSONObject(result);
		JSONArray arrayJson = objectJson.getJSONArray(Constants.SERVICE_TAG);
		Type listType = new TypeToken<ArrayList<Service>>() {
		}.getType();

		return new Gson().fromJson(arrayJson.toString(), listType);
	}

	private void showServicesNotFound() {
		listview.setVisibility(View.GONE);
		textview.setVisibility(View.VISIBLE);
	}
}
