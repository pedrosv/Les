package br.com.addvisor.asynctask;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.os.AsyncTask;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.adapters.ServiceAdapter;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.City;
import br.com.addvisor.model.Service;
import br.com.addvisor.util.Constants;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskServicesBySearch extends AsyncTask<String, String, String[]> {
	private Message toast;
	private String searchWord;
	private View view;
	private City city;
	
	private LinearLayout searchLayout;
	private ListView resultsListView;
	private TextView servicesNotFound;

	public AsyncTaskServicesBySearch(String searchWord, City city, View view) {
		super();
		this.searchWord = searchWord;
		this.city = city;
		this.view = view;
		this.toast = new Message(view.getContext());
		
		this.searchLayout = (LinearLayout) view.findViewById(R.id.linear_layout_search);
		this.resultsListView = (ListView) view.findViewById(R.id.listview_search_result);
		this.servicesNotFound = (TextView) view.findViewById(R.id.textview_no_itens_found);
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.getServiceBySearch(city, searchWord);
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
		resultsListView.setAdapter(new ServiceAdapter(view.getContext(), services));
		resultsListView.setVisibility(View.VISIBLE);
		searchLayout.setVisibility(View.INVISIBLE);
	}

	private List<Service> getListServiceByJson(String result) throws JSONException {
		JSONObject objectJson = new JSONObject(result);
		JSONArray arrayJson = objectJson.getJSONArray(Constants.SERVICE_TAG);
		Type listType = new TypeToken<ArrayList<Service>>() {
		}.getType();

		return new Gson().fromJson(arrayJson.toString(), listType);
	}

	private void showServicesNotFound() {
		resultsListView.setVisibility(View.GONE);
		servicesNotFound.setVisibility(View.VISIBLE);
		searchLayout.setVisibility(View.INVISIBLE);
	}
}
