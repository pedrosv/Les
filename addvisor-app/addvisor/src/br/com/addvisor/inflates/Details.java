package br.com.addvisor.inflates;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskEvaluateByService;
import br.com.addvisor.model.Service;

public class Details {

	private AlertDialog alertDialog;
	private Context context;
	private Service service;

	public Details(Service service, Context context) {
		this.context = context;
		this.service = service;
	}

	@SuppressLint("InflateParams")
	public void inflate() {
		LayoutInflater factory = LayoutInflater.from(context);
		final View view = factory.inflate(R.layout.activity_details, null);
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setView(view);

		TextView tvName = (TextView) view.findViewById(R.id.texview_service_name_details);
		TextView tvInformation = (TextView) view.findViewById(R.id.texview_service_description_details);
		TextView tvPhone = (TextView) view.findViewById(R.id.texview_service_phone_details);
		RatingBar rbNote = (RatingBar) view.findViewById(R.id.rating_bar_note_details);

		tvName.setText(service.getName());
		tvInformation.setText(service.getAddress().toString());
		tvPhone.setText(service.getPhones().get(0));
		
		LayerDrawable stars = (LayerDrawable) rbNote.getProgressDrawable();
		stars.getDrawable(2).setColorFilter(context.getResources().getColor(R.color.yellow_dark), PorterDuff.Mode.SRC_ATOP);
		stars.getDrawable(1).setColorFilter(context.getResources().getColor(R.color.yellow_light), PorterDuff.Mode.SRC_ATOP);
		stars.getDrawable(0).setColorFilter(context.getResources().getColor(R.color.holo_gray_light), PorterDuff.Mode.SRC_ATOP);

		rbNote.setRating(service.getMedia());
		rbNote.setEnabled(false);

		AsyncTaskEvaluateByService asyncTask = new AsyncTaskEvaluateByService(service, view);
		asyncTask.execute();

		alertDialog = builder.create();
		alertDialog.show();
	}

	public void close() {
		alertDialog.cancel();
	}
}
