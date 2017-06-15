package br.com.addvisor.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import br.com.addvisor.R;
import br.com.addvisor.controller.LocationController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Location;
import br.com.addvisor.model.User;

public class MainActivity extends FragmentActivity {

	private Button buttonSearchService;
	private Button buttonCadastreService;
	private Button buttonMyServices;
	private Button buttonMyFavoritesServices;
	private Button buttonLocation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		buttonSearchService = (Button) findViewById(R.id.image_button_main_buscar);
		buttonSearchService.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startIntent(ServiceActivity.class);
			}
		});

		buttonCadastreService = (Button) findViewById(R.id.image_button_main_cadastrar);
		buttonCadastreService.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startIntent(CreateServiceActivity.class);
			}
		});

		buttonMyServices = (Button) findViewById(R.id.image_button_main_meus_servicos);
		buttonMyServices.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startIntent(MyServicesActivity.class);
			}
		});

		buttonMyFavoritesServices = (Button) findViewById(R.id.image_button_main_meus_favoritos);
		buttonMyFavoritesServices.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startIntent(MyFavoritesActivity.class);
			}
		});

		buttonLocation = (Button) findViewById(R.id.button_location);
		buttonLocation.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				inflateLocation();
			}
		});

		User user = UserController.getInstance().getUser();
		if (user != null && (user.getCity() == null || user.getCity().getState() == null)) {
			inflateLocation();
		}
	}

	private void inflateLocation() {
		Location view = new Location(MainActivity.this);
		view.inflate();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			startIntent(EditAccountActivity.class);
			return true;
		} else if (id == R.id.logout) {
			UserController.getInstance().logout();
			startIntent(LoginActivity.class);
			finish();
			return true;
		}else if ( id == R.id.action_url){
			String url = "https://sites.google.com/site/appeuconfio/";
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(url)); 
			startActivity(i);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		dispose();
		finish();
	}

	private void startIntent(Class<?> class_) {
		Intent mainIntent = new Intent(getApplicationContext(), class_);
		startActivity(mainIntent);
	}

	private void dispose() {
		LocationController.getInstance().dispose();
		UserController.getInstance().dispose();
	}
}
