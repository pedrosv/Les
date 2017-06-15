package br.com.addvisor.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import br.com.addvisor.R;
import br.com.addvisor.adapters.ServiceAdapter;
import br.com.addvisor.asynctask.AsyncTaskServicesByCategory;
import br.com.addvisor.controller.ServiceController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.model.User;
import br.com.addvisor.model.enums.ServiceCat;

public class BeautyWelfareFragment extends Fragment {
	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_beauty_welfare, container, false);

		User user = UserController.getInstance().getUser();
		ListView listview = (ListView) view.findViewById(R.id.listview_beauty_welfare);
		TextView textview = (TextView) view.findViewById(R.id.textview_sem_servicos_beleza_bemestar);

		ServiceController serviceController = ServiceController.getInstance();
		if (!serviceController.getCache().containsKey(ServiceCat.BELEZA_E_BEM_ESTAR)) {
			AsyncTaskServicesByCategory asyncTask = new AsyncTaskServicesByCategory(ServiceCat.BELEZA_E_BEM_ESTAR, user.getCity(), listview, textview, view);
			asyncTask.execute();
		}else {
			listview.setAdapter(new ServiceAdapter(view.getContext(), serviceController.getCache().get(ServiceCat.BELEZA_E_BEM_ESTAR)));
		}
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

}