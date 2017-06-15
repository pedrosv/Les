package br.com.addvisor.activities;

import java.io.IOException;

import org.json.JSONException;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import br.com.addvisor.R;
import br.com.addvisor.connection.Connection;
import br.com.addvisor.controller.LocationController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.util.InternetConnection;
import br.com.addvisor.util.StatusRequest;

public class SplashActivity extends ActionBarActivity {

	private UserController controller;
	private LocationController location;
	private Message myToast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
		myToast = new Message(getApplicationContext());

		controllerConfig();
		locationConfig();
	}

	private void controllerConfig() {
		controller = UserController.getInstance();
		controller.setFilesDir(getFilesDir().toString());

		if (controller.fileExists()) {
			controller.load();
		}
	}

	private void locationConfig() {
		location = LocationController.getInstance();
		location.setFilesDir(getFilesDir().toString());

		if (location.filesExists()) {
			location.load();
			init();
		} else {
			requestLocations();
		}
	}

	private void requestLocations() {
		InternetConnection internet = new InternetConnection(getApplicationContext());
		if (internet.isOnline()) {
			AsyncTaskGetCities request = new AsyncTaskGetCities();
			request.execute();
		} else {
			myToast.showNoInternetConnection();
			finish();
		}
	}

	private void init() {
		if (controller.getUser() != null) {
			startIntent(MainActivity.class);
		} else {
			startIntent(LoginActivity.class);
		}
	}

	private void startIntent(Class<?> class_) {
		Intent mainIntent = new Intent(getApplicationContext(), class_);
		startActivity(mainIntent);
		finish();
	}

	private class AsyncTaskGetCities extends AsyncTask<String, String, String[]> {
		@Override
		protected String[] doInBackground(String... arg0) {
			return Connection.getAllCities();
		}

		@Override
		protected void onPostExecute(String[] result) {
			super.onPostExecute(result);

			if (StatusRequest.sucess(result)) {
				try {
					location.saveCities(result[0]);
					location.load();
					init();
				} catch (JSONException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				myToast.showServerFail();
				finish();
			}
		}
	}
}
