package br.com.addvisor.fragments;

import java.util.List;

import br.com.addvisor.R;
import br.com.addvisor.adapters.ServiceAdapter;
import br.com.addvisor.asynctask.AsyncTaskServicesByContacts;
import br.com.addvisor.controller.ServiceController;
import br.com.addvisor.model.Service;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ContactsAdviceFragment extends Fragment {
	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_services_contacts, container, false);

		ServiceController serviceController = ServiceController.getInstance();
		List<Service> cacheFriends = serviceController.getFriendsLits();
		
		if (cacheFriends.isEmpty()) {
			AsyncTaskServicesByContacts asyncTask = new AsyncTaskServicesByContacts(getActivity(), view);
			asyncTask.execute();
		} else {
			ListView listview = (ListView) view.findViewById(R.id.listview_contacts_advice);
			listview.setAdapter(new ServiceAdapter(view.getContext(), cacheFriends));
		}
		
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}
}
