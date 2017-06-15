package br.com.addvisor.activities;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import br.com.addvisor.R;
import br.com.addvisor.adapters.TabsPagerAdapter;
import br.com.addvisor.controller.ServiceController;
import br.com.addvisor.controller.UserController;
import br.com.addvisor.model.User;
import br.com.addvisor.model.enums.ServiceCat;

public class ServiceActivity extends FragmentActivity implements ActionBar.TabListener {

	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private android.app.ActionBar actionBar;
	private User user;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_services);
		user = UserController.getInstance().getUser();

		String[] tabs = { getResources().getString(R.string.search), user.getCity().toString(), getResources().getString(R.string.seus_amigos_recomendam),
				ServiceCat.ALIMENTACAO.getValue(), ServiceCat.ANIMAIS.getValue(), ServiceCat.AULAS.getValue(), ServiceCat.AUTOMOTIVO.getValue(),
				ServiceCat.BELEZA_E_BEM_ESTAR.getValue(), ServiceCat.CASA_E_CONSTRUCAO.getValue(), ServiceCat.COMUNICACAO_E_ARTES.getValue(),
				ServiceCat.CONSULTORIA.getValue(), ServiceCat.DELIVERY.getValue(), ServiceCat.EVENTOS_E_MUSICA.getValue(), ServiceCat.SAUDE.getValue(),
				ServiceCat.TECNOLOGIA.getValue(), ServiceCat.TRANSPORTE.getValue(), ServiceCat.SEGURANCA.getValue(), ServiceCat.OUTROS.getValue() };

		// Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.setStackedBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar));

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name).setTabListener((TabListener) this));
		}

		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}

	@Override
	public void onTabReselected(Tab arg0, android.app.FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab tab, android.app.FragmentTransaction arg1) {
		viewPager.setCurrentItem(tab.getPosition());

	}

	@Override
	public void onTabUnselected(Tab arg0, android.app.FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void onBackPressed() {
		ServiceController.getInstance().dispose();
		super.onBackPressed();
	}
}
