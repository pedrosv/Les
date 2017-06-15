package br.com.addvisor.inflates;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskCreateEvaluate;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.model.Evaluate;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;

public class EvaluateScreen {

	private AlertDialog alertDialog;
	private Context context;
	private Service service;
	private User user;

	public EvaluateScreen(Service service, Context context) {
		this.context = context;
		this.service = service;
		this.user = UserController.getInstance().getUser();
	}

	@SuppressLint("InflateParams")
	public void inflate() {
		LayoutInflater factory = LayoutInflater.from(context);
		final View view = factory.inflate(R.layout.activity_evaluate, null);
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setView(view);
		
		TextView tvMessage = (TextView) view.findViewById(R.id.texview_service_name_evaluate);
		final EditText etComment = (EditText) view.findViewById(R.id.edit_text_comment_evaluate);
		
		final RatingBar rbNote = (RatingBar) view.findViewById(R.id.rating_bar_note);
		LayerDrawable stars = (LayerDrawable) rbNote.getProgressDrawable();
		stars.getDrawable(2).setColorFilter(context.getResources().getColor(R.color.yellow_dark), PorterDuff.Mode.SRC_ATOP);
		stars.getDrawable(1).setColorFilter(context.getResources().getColor(R.color.yellow_light), PorterDuff.Mode.SRC_ATOP);
		stars.getDrawable(0).setColorFilter(context.getResources().getColor(R.color.holo_gray_bright), PorterDuff.Mode.SRC_ATOP);

		
		tvMessage.setText(service.getName());
		builder.setNegativeButton(context.getResources().getString(R.string.cancel_captalize), new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		});

		builder.setPositiveButton(context.getResources().getString(R.string.save_captalize), new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				Float note = rbNote.getRating();
				String comment = etComment.getText().toString();
				Evaluate evaluate = new Evaluate(user, service, note, comment);
				
				AsyncTaskCreateEvaluate asyncTask = new AsyncTaskCreateEvaluate(service, evaluate, view);
				asyncTask.execute();
			}
		});

		alertDialog = builder.create();
		alertDialog.show();
	}

	public void close() {
		alertDialog.cancel();
	}
}
