package br.com.addvisor.fragments;

import br.com.addvisor.R;
import br.com.addvisor.asynctask.AsyncTaskServicesBySearch;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.User;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

public class SearchFragment extends Fragment {
	private View view;
	private Message toast;
	private ImageButton searchButton;
	private EditText searchField;
	private User user;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_search, container, false);
		toast = new Message(view.getContext());
		user = UserController.getInstance().getUser();

		searchField = (EditText) view.findViewById(R.id.edit_search);
		searchButton = (ImageButton) view.findViewById(R.id.search_button);
		searchButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if (searchField.getText().toString().compareTo("") == 0) {
					toast.showToast("Campo de busca vazio!");

				} else {
					search(searchField.getText().toString());
				}
			}

		});

		return view;
	}

	private void search(String searched_word) {
		AsyncTaskServicesBySearch request = new AsyncTaskServicesBySearch(searched_word, user.getCity(), view);
		request.execute();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

}
