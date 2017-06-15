package br.com.addvisor.webservice.dao;

import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;

import br.com.addvisor.webservice.models.pojo.City;
import br.com.addvisor.webservice.util.EntityFactory;

public class LocationDAO {
	
	private static LocationDAO locationDAO;
	private EntityManager em;
	
	private LocationDAO(){
		em = EntityFactory.getInstance().createEntityManager();
	}

	public static LocationDAO getInstance() {
		if(locationDAO == null){
			locationDAO = new LocationDAO();
		}
		return locationDAO;
	}
	
	public City getCity(Long cityId){
		return em.find(City.class, cityId);
	}
	
	@PreDestroy
	public void closeConnection(){
		em.close();
		EntityFactory.getInstance().close();
	}
}
