package br.com.addvisor.adapters;

import java.util.List;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskCreateFavorite;
import br.com.addvisor.inflates.Details;
import br.com.addvisor.inflates.EvaluateScreen;
import br.com.addvisor.model.Service;
import br.com.addvisor.util.ReceiverNotification;

public class ServiceAdapter extends BaseAdapter {

	private LayoutInflater mInflater;
	private List<Service> services;
	private Context context;

	public ServiceAdapter(Context context, List<Service> services) {
		this.services = services;
		this.context = context;
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return services.size();
	}

	@Override
	public Service getItem(int position) {
		return services.get(position);
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@SuppressLint("InflateParams")
	@Override
	public View getView(int position, View view, ViewGroup parent) {
		Suport iconHolder;

		if (view == null) {
			view = mInflater.inflate(R.layout.item_service, null);
			iconHolder = new Suport();
			iconHolder.name = (TextView) view.findViewById(R.id.textview_name_service);
			iconHolder.ratingBar = (RatingBar) view.findViewById(R.id.rating_service_minor);
			iconHolder.description = (TextView) view.findViewById(R.id.texview_description_service);
			iconHolder.address = (TextView) view.findViewById(R.id.texview_address_service);
			iconHolder.phone = (TextView) view.findViewById(R.id.textview_phone_service);
			iconHolder.callButton = (ImageButton) view.findViewById(R.id.call_button);
			iconHolder.evaluateButton = (ImageButton) view.findViewById(R.id.evaluate_button);
			iconHolder.infoButton = (ImageButton) view.findViewById(R.id.info_button);
			iconHolder.favoriteButton = (ImageButton) view.findViewById(R.id.favorite_button);
			view.setTag(iconHolder);

		} else {
			iconHolder = (Suport) view.getTag();
		}

		final Service service = services.get(position);
		iconHolder.name.setText(service.getName());
		iconHolder.description.setText(service.getDescription());
		iconHolder.address.setText(service.getAddress().toString());
		iconHolder.phone.setText(service.getPhones().get(0));

		LayerDrawable stars = (LayerDrawable) iconHolder.ratingBar.getProgressDrawable();
		stars.getDrawable(2).setColorFilter(context.getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
		stars.getDrawable(1).setColorFilter(context.getResources().getColor(R.color.yellow_light), PorterDuff.Mode.SRC_ATOP);
		stars.getDrawable(0).setColorFilter(context.getResources().getColor(R.color.yellow_dark), PorterDuff.Mode.SRC_ATOP);

		iconHolder.ratingBar.setRating(service.getMedia());
		iconHolder.callButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				String posted_by = service.getPhones().get(0);
				String uri = "tel:" + posted_by.trim();
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse(uri));
				context.startActivity(intent);
				
				createNotification(v);
			}
		});

		iconHolder.favoriteButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				AsyncTaskCreateFavorite request = new AsyncTaskCreateFavorite(service, context);
				request.execute();
			}
		});

		iconHolder.evaluateButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				EvaluateScreen view = new EvaluateScreen(service, context);
				view.inflate();
			}
		});

		iconHolder.infoButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Details view = new Details(service, context);
				view.inflate();
			}
		});

		return view;
	}
	
	private void createNotification(final View v){
		final long ONE_SECOND = 1000;
	    //final long TEN_SECONDS = ONE_SECOND * 10;
	    final long SIXTY_SECONDS = ONE_SECOND * 60;
	    final long SIXTY_MINUTS = SIXTY_SECONDS * 60;
	    final long ONE_DAY = SIXTY_MINUTS * 24;
	    final long ONE_WEEK = ONE_DAY * 7;
	    
	    
	    Intent intent = new Intent(v.getContext(), ReceiverNotification.class);
	    PendingIntent pi = PendingIntent.getBroadcast(v.getContext(), 0, intent, 0);
	    
	    
	    AlarmManager am = (AlarmManager) v.getContext().getSystemService(Context.ALARM_SERVICE);
	    am.set( AlarmManager.RTC, System.currentTimeMillis() + ONE_WEEK, pi );
	}

	/** * Classe de suporte para os itens do layout. */
	private class Suport {
		TextView name;
		RatingBar ratingBar;
		TextView description;
		TextView address;
		TextView phone;
		ImageButton callButton;
		ImageButton evaluateButton;
		ImageButton infoButton;
		ImageButton favoriteButton;
	}
}