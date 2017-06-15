package br.com.addvisor.asynctask;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;
import br.com.addvisor.R;
import br.com.addvisor.adapters.EvaluateAdapter;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Evaluate;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;
import br.com.addvisor.util.Constants;
import br.com.addvisor.util.Converter;
import br.com.addvisor.util.StatusRequest;

public class AsyncTaskEvaluateByService extends AsyncTask<String, String, String[]> {
	private Message toast;
	private Service service;
	private View view;

	public AsyncTaskEvaluateByService(Service service, View view) {
		super();
		this.service = service;
		this.view = view;
		this.toast = new Message(view.getContext());
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		return Connection.getEvaluatesByService(service);
	}

	@Override
	protected void onPostExecute(String[] result) {
		super.onPostExecute(result);
		if (StatusRequest.sucess(result)) {
			try {
				showListview(getListEvaluatesByJson(result[0]));
			} catch (JSONException e) {
				toast.showToast("Sem avaliações");
			}
		} else {
			toast.showToast("Erro no servidor");
		}
	}

	private void showListview(List<Evaluate> evaluates) {
		ListView listview = (ListView) view.findViewById(R.id.listview_evaluates);
		listview.setAdapter(new EvaluateAdapter(view.getContext(), evaluates));
	}

	private List<Evaluate> getListEvaluatesByJson(String result) throws JSONException {
		JSONObject objectJson = new JSONObject(result);
		JSONArray arrayJson = objectJson.getJSONArray(Constants.EVALUATE_TAG);
		List<Evaluate> evaluates = new ArrayList<Evaluate>();

		for (int i = 0; i < arrayJson.length(); i++) {
			JSONObject json = arrayJson.getJSONObject(i);
			String comment = json.get(Constants.COMMENT_TAG).toString();
			Float note = Float.parseFloat(json.get(Constants.NOTE_TAG).toString());
			User user = Converter.getUserInstance(json.get(Constants.USER_TAG).toString());

			Evaluate evaluate = new Evaluate();
			evaluate.setComment(comment);
			evaluate.setNote(note);
			evaluate.setUser(user);
			evaluate.setService(service);

			evaluates.add(evaluate);
		}
		return evaluates;
	}
}
