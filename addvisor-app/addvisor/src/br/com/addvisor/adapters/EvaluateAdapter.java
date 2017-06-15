package br.com.addvisor.adapters;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.model.Evaluate;

public class EvaluateAdapter extends BaseAdapter {

	private LayoutInflater mInflater;
	private List<Evaluate> evaluates;

	public EvaluateAdapter(Context context, List<Evaluate> evaluates) {
		this.evaluates = evaluates;
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return evaluates.size();
	}

	@Override
	public Evaluate getItem(int position) {
		return evaluates.get(position);
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
			view = mInflater.inflate(R.layout.item_evaluate, null);
			iconHolder = new Suport();
			iconHolder.name = (TextView) view.findViewById(R.id.textview_name_user_evaluate);
			iconHolder.ratingBar = (RatingBar) view.findViewById(R.id.rating_evaluate_minor);
			iconHolder.comment = (TextView) view.findViewById(R.id.textview_comment_evaluate);
			view.setTag(iconHolder);

		} else {
			iconHolder = (Suport) view.getTag();
		}

		final Evaluate evaluate = evaluates.get(position);
		iconHolder.name.setText(evaluate.getUser().getName());
		iconHolder.comment.setText(evaluate.getComment());

		LayerDrawable stars = (LayerDrawable) iconHolder.ratingBar.getProgressDrawable();
		stars.getDrawable(2).setColorFilter(view.getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
		stars.getDrawable(1).setColorFilter(view.getResources().getColor(R.color.yellow_light), PorterDuff.Mode.SRC_ATOP);
		stars.getDrawable(0).setColorFilter(view.getResources().getColor(R.color.yellow_dark), PorterDuff.Mode.SRC_ATOP);
		iconHolder.ratingBar.setRating(evaluate.getNote());

		return view;
	}

	/** * Classe de suporte para os itens do layout. */
	private class Suport {
		TextView name;
		RatingBar ratingBar;
		TextView comment;
	}
}