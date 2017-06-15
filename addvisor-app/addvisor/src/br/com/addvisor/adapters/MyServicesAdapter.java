package br.com.addvisor.adapters;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.activities.EditServiceActivity;
import br.com.addvisor.controller.ServiceController;
import br.com.addvisor.model.Service;

public class MyServicesAdapter extends BaseAdapter {

	private LayoutInflater mInflater;
	private List<Service> services;
	private Context context;

	public MyServicesAdapter(Context context, List<Service> services) {
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
			view = mInflater.inflate(R.layout.my_items_service, null);
			iconHolder = new Suport();
			iconHolder.name = (TextView) view.findViewById(R.id.textview_name_myservice);
			iconHolder.ratingBar = (RatingBar) view.findViewById(R.id.rating_my_service_minor);
			iconHolder.description = (TextView) view.findViewById(R.id.texview_description_myservice);
			iconHolder.address = (TextView) view.findViewById(R.id.texview_address_myservice);
			iconHolder.phone = (TextView) view.findViewById(R.id.textview_phone_myservice);
			iconHolder.editButton = (ImageButton) view.findViewById(R.id.my_services_edit_button);
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
		iconHolder.editButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ServiceController.getInstance().setServiceToEdit(service);
				Intent intent = new Intent(context, EditServiceActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				context.startActivity(intent);
			}
		});

		return view;
	}

	/** * Classe de suporte para os itens do layout. */
	private class Suport {
		TextView name;
		RatingBar ratingBar;
		TextView description;
		TextView address;
		TextView phone;
		ImageButton editButton;
	}
}