package br.com.addvisor.fragments;

import java.util.List;

import br.com.addvisor.R;
import br.com.addvisor.adapters.ServiceAdapter;
import br.com.addvisor.asynctask.AsyncTaskServicesByCity;
import br.com.addvisor.controller.ServiceController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.inflates.Message;
import br.com.addvisor.model.City;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class CityFragment extends Fragment {
	private View view;
	private Message toast;
	private User user;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_services_city, container, false);
		user = UserController.getInstance().getUser();
		toast = new Message(view.getContext());

		recommendationByCity();
		return view;
	}

	private void recommendationByCity() {
		if (user.getCity() != null && user.getCity().getState() != null) {
			City city = user.getCity();

			ServiceController serviceController = ServiceController.getInstance();
			List<Service> cacheCity = serviceController.getCityList();
			
			if (cacheCity.isEmpty()) {
				AsyncTaskServicesByCity request = new AsyncTaskServicesByCity(city, view);
				request.execute();
			} else {
				ListView listview = (ListView) view.findViewById(R.id.listview_city_advice);
				listview.setAdapter(new ServiceAdapter(view.getContext(), cacheCity));
			}
			
		} else {
			toast.showToast("Informe em qual cidade você está para ver nossas recomendações");
		}
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

}
