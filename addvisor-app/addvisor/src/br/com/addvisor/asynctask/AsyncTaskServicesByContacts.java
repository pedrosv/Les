package br.com.addvisor.asynctask;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.adapters.ServiceAdapter;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.ServiceController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.Agenda;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;
import br.com.addvisor.util.Constants;
import br.com.addvisor.util.StatusRequest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class AsyncTaskServicesByContacts extends AsyncTask<String, String, String[]> {

	private Message toast;
	private View view;
	private Activity activity;

	public AsyncTaskServicesByContacts(Activity activity, View view) {
		super();
		this.view = view;
		this.toast = new Message(view.getContext());
		this.activity = activity;
	}

	private Agenda readAgenda() {
		Agenda agenda = new Agenda();
		ContentResolver cr = activity.getContentResolver();
		Cursor cur = cr.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);

		if (cur.getCount() > 0) {
			while (cur.moveToNext()) {
				String id = cur.getString(cur.getColumnIndex(ContactsContract.Contacts._ID));
				String name = cur.getString(cur.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));

				if (Integer.parseInt(cur.getString(cur.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER))) > 0) {
					Cursor pCur = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,
							ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = ?", new String[] { id }, null);

					while (pCur.moveToNext()) {
						String phoneNumber = pCur.getString(pCur.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

						if (phoneNumber.length() >= 8) {
							agenda.addContact(name, handlerPhone(phoneNumber));
						}
					}
					pCur.close();
				}
			}
		}
		return agenda;
	}

	private String handlerPhone(String phone) {
		User user = UserController.getInstance().getUser();
		phone = phone.replace(" ", "").replace("-", "").replace("+55", "");

		if (phone.length() >= 13) {
			phone = phone.substring(3, phone.length());
		}

		if (String.valueOf(phone.charAt(0)).equals("0")) {
			phone = phone.substring(1, phone.length());
		}

		if (phone.length() < 10) {
			phone = user.getDDD() + phone;
		}

		return phone.substring(0, 2) + " " + phone.substring(2, phone.length());
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected String[] doInBackground(String... arg0) {
		User user = UserController.getInstance().getUser();
		return Connection.getServiceByContacts(user.getCity(), readAgenda());
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
		serviceController.setFriendsLits(services);
		ListView listview = (ListView) view.findViewById(R.id.listview_contacts_advice);
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
		TextView tv = (TextView) view.findViewById(R.id.textview_sem_servicos_contatos);
		ListView lv = (ListView) view.findViewById(R.id.listview_contacts_advice);
		lv.setVisibility(View.GONE);
		tv.setVisibility(View.VISIBLE);
	}
}
