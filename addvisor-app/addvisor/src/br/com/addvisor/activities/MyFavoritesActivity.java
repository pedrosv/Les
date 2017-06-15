package br.com.addvisor.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskMyFavorites;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.User;

public class MyFavoritesActivity extends ActionBarActivity {

	private Message toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_favorite_services);
		showMyServices();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	private void showMyServices() {
		User user = UserController.getInstance().getUser();
		if (user != null && user.getCity().getState() != null) {
			AsyncTaskMyFavorites request = new AsyncTaskMyFavorites(MyFavoritesActivity.this);
			request.execute();
		} else {
			toast.showToast("Você não possui serviços cadastrados em favoritos");
		}
	}
}
