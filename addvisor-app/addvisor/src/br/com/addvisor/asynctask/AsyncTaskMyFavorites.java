package br.com.addvisor.asynctask;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.adapters.MyFavoritesAdapter;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.ServiceController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Loading;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;
import br.com.addvisor.util.Constants;
import br.com.addvisor.util.StatusRequest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class AsyncTaskMyFavorites extends AsyncTask<String, String, String[]> {
	private User user;
	private Message toast;
	private Loading loadingView;
	private Activity activity;
	private ServiceController serviceControl;

	public AsyncTaskMyFavorites(Activity activity) {
		super();
		this.user = UserController.getInstance().getUser();
		this.loadingView = new Loading(activity);
		this.activity = activity;
		this.toast = new Message(activity.getApplicationContext());
		this.serviceControl = ServiceController.getInstance();
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		loadingView.showInflate("Carregando ...");
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.getAllFavorite(user);
	}

	@Override
	protected void onPostExecute(String[] result) {
		super.onPostExecute(result);
		if (StatusRequest.sucess(result)) {
			try {
				serviceControl.setFavoriteLits(getListServiceByJson(result[0]));
				showListview();
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

	private void showListview() {
		ListView listview = (ListView) activity.findViewById(R.id.listview_favoritos_services);
		listview.setAdapter(new MyFavoritesAdapter(activity, serviceControl.getFavoriteLits()));
	}

	private List<Service> getListServiceByJson(String result) throws JSONException {
		JSONObject objectJson = new JSONObject(result);
		JSONArray arrayJson = objectJson.getJSONArray(Constants.SERVICE_TAG);
		Type listType = new TypeToken<ArrayList<Service>>() {
		}.getType();
		List<Service> favorites = new Gson().fromJson(arrayJson.toString(), listType);
		return favorites;
	}

	private void showServicesNotFound() {
		TextView tv = (TextView) activity.findViewById(R.id.textview_sem_servicos_favoritos);
		ListView lv = (ListView) activity.findViewById(R.id.listview_favoritos_services);
		lv.setVisibility(View.GONE);
		tv.setVisibility(View.VISIBLE);
	}
}
