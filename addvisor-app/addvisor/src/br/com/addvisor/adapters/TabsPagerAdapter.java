package br.com.addvisor.adapters;

import br.com.addvisor.fragments.AnimalsFragment;
import br.com.addvisor.fragments.AutomotiveFragment;
import br.com.addvisor.fragments.BeautyWelfareFragment;
import br.com.addvisor.fragments.CityFragment;
import br.com.addvisor.fragments.ClassesFragment;
import br.com.addvisor.fragments.CommunicationArtFragment;
import br.com.addvisor.fragments.ConsultancyFragment;
import br.com.addvisor.fragments.ContactsAdviceFragment;
import br.com.addvisor.fragments.DeliveryFragment;
import br.com.addvisor.fragments.EventsMusicFragment;
import br.com.addvisor.fragments.FoodFragment;
import br.com.addvisor.fragments.HealthFragment;
import br.com.addvisor.fragments.HouseBuildingFragment;
import br.com.addvisor.fragments.OthersFragment;
import br.com.addvisor.fragments.SearchFragment;
import br.com.addvisor.fragments.SecurityFragment;
import br.com.addvisor.fragments.TechnologyFragment;
import br.com.addvisor.fragments.TransportFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new SearchFragment();
		case 1:
			return new CityFragment();
		case 2:
			return new ContactsAdviceFragment();
		case 3: 
			return new FoodFragment();
		case 4:
			return new AnimalsFragment();
		case 5:
			return new ClassesFragment();
		case 6:
			return new AutomotiveFragment();
		case 7:
			return new BeautyWelfareFragment();
		case 8:
			return new HouseBuildingFragment();
		case 9:
			return new CommunicationArtFragment();
		case 10:
			return new ConsultancyFragment();
		case 11:
			return new DeliveryFragment();
		case 12:
			return new EventsMusicFragment();
		case 13:
			return new HealthFragment();
		case 14:
			return new TechnologyFragment();
		case 15:
			return new TransportFragment();
		case 16:
			return new SecurityFragment();
		case 17:
			return new OthersFragment();
		}
		
		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 18;
	
	}
}