package br.com.addvisor.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.addvisor.model.Service;
import br.com.addvisor.model.enums.ServiceCat;

public class ServiceController {

	private Map<ServiceCat, List<Service>> cache;
	private List<Service> cityList;
	private List<Service> friendsLits;
	private List<Service> favoriteLits;
	private Service serviceToEdit;
	private static ServiceController instance;

	private ServiceController() {
		super();
		cache = new HashMap<ServiceCat, List<Service>>();
		cityList = new ArrayList<Service>();
		friendsLits = new ArrayList<Service>();
		favoriteLits = new ArrayList<Service>();
	}

	public static ServiceController getInstance() {
		if (instance == null) {
			instance = new ServiceController();
		}
		return instance;
	}

	public Map<ServiceCat, List<Service>> getCache() {
		return cache;
	}

	public void setCache(Map<ServiceCat, List<Service>> cache) {
		this.cache = cache;
	}

	public List<Service> getCityList() {
		return cityList;
	}

	public void setCityList(List<Service> cityList) {
		this.cityList = cityList;
	}

	public List<Service> getFriendsLits() {
		return friendsLits;
	}

	public void setFriendsLits(List<Service> friendsLits) {
		this.friendsLits = friendsLits;
	}

	public Service getServiceToEdit() {
		return serviceToEdit;
	}

	public void setServiceToEdit(Service serviceToEdit) {
		this.serviceToEdit = serviceToEdit;
	}

	public List<Service> getFavoriteLits() {
		return favoriteLits;
	}

	public void setFavoriteLits(List<Service> favoriteLits) {
		this.favoriteLits = favoriteLits;
	}

	public void dispose() {
		cache = null;
		cityList = null;
		friendsLits = null;
		serviceToEdit = null;
		instance = null;
	}
}
