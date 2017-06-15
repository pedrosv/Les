package br.com.addvisor.webservice.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.addvisor.webservice.exceptions.EvaluateTransactionException;
import br.com.addvisor.webservice.exceptions.ServiceTransactionException;
import br.com.addvisor.webservice.models.pojo.City;
import br.com.addvisor.webservice.models.pojo.Evaluate;
import br.com.addvisor.webservice.models.pojo.Service;
import br.com.addvisor.webservice.models.pojo.enums.ServiceCat;
import br.com.addvisor.webservice.util.EntityFactory;

public class ServiceDAO {

	private static ServiceDAO sd;
	private EntityManager em;

	private ServiceDAO() {
		em = EntityFactory.getInstance().createEntityManager();
	}

	public static ServiceDAO getInstance() {
		if (sd == null) {
			sd = new ServiceDAO();
		}
		return sd;
	}

	public Service update(Service s) {
		if (!em.getTransaction().isActive()) {
			em.clear();
			em.getTransaction().begin();
		}
		Service service = em.merge(s);
		em.getTransaction().commit();

		return service;
	}

	public List<Service> searchServicesTopRated(Long cityId, List<String> phones) {
		if (phones == null || phones.isEmpty()) {
			return new ArrayList<Service>();
		}
		
		String phoneTuples = getPhoneTuples(phones);
		String sql = "SELECT distinct s FROM " + Evaluate.class.getSimpleName() + " e, " + Service.class.getSimpleName()
				+ " s WHERE e.service.id = s.id and e.user.phone in " + phoneTuples + " and s.address.city.id=" + cityId;

		TypedQuery<Service> servicesQuery = em.createQuery(sql, Service.class);

		List<Service> services = servicesQuery.getResultList();
		ordenarPorMedia(services);

		return services;
	}

	private String getPhoneTuples(List<String> phones) {
		String phoneTuple = "(";
		for (String p : phones) {
			phoneTuple += "'" + p + "', ";
		}
		phoneTuple += ")";
		phoneTuple = phoneTuple.replace(", )", ")");

		return phoneTuple;
	}

	public Service findServiceBy(Long service_id) {
		return em.find(Service.class, service_id);
	}

	public Service findServiceBy(List<String> phones) {
		if(phones.isEmpty()){
			return null;
		}
		String phoneTuple = getPhoneTuples(phones);
		String sql = "SELECT s FROM " + Service.class.getSimpleName() + " s join s.phones p WHERE p in " + phoneTuple;
		TypedQuery<Service> query = em.createQuery(sql, Service.class);
		try {
			return query.getSingleResult();
		} catch (NoResultException n) {
			return null;
		}
	}

	public List<City> getAllLocations() {

		String allCities = "FROM " + City.class.getSimpleName();

		TypedQuery<City> query = em.createQuery(allCities, City.class);
		List<City> allLocations = null;
		try {
			allLocations = query.getResultList();
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return allLocations;
	}

	public List<Service> getAllServicesToUser(Long userId) {
		String sql = "FROM " + Service.class.getSimpleName() + " WHERE user.id = :id";
		TypedQuery<Service> query = em.createQuery(sql, Service.class).setParameter("id", userId);
		List<Service> services = query.getResultList();
		ordenarPorMedia(services);
		return services;
	}

	public List<Service> getAllServicesToCity(City city) {
		String allServicesToCity = "FROM " + Service.class.getSimpleName() + " service WHERE service.address.city.id='" + city.getId() + "'";
		TypedQuery<Service> query = null;
		try {
			query = em.createQuery(allServicesToCity, Service.class);
			List<Service> services = query.getResultList();
			ordenarPorMedia(services);
			return services;
		} catch (Exception e) {
			// e.printStackTrace();
			return null;
		}
	}

	public boolean remove(Service s) {
		if (s.getId() == null) {
			return false;
		}
		try {
			EvaluateDAO.getInstance().removeEvaluatesBy(s);
			if (!em.getTransaction().isActive()) {
				em.clear();
				em.getTransaction().begin();
			}
			em.remove(em.merge(s));
			em.getTransaction().commit();
		} catch (EvaluateTransactionException e) {
			return false;
		}
		return true;
	}

	public List<Service> findByLocationAndCategory(Long city, ServiceCat categoria) {
		String query = "FROM " + Service.class.getSimpleName() + " WHERE address.city.id = :city AND category = :category";
		TypedQuery<Service> typedQuery = em.createQuery(query, Service.class);
		typedQuery.setParameter("city", city);
		typedQuery.setParameter("category", categoria);
		List<Service> services = typedQuery.getResultList();
		ordenarPorMedia(services);
		return services;
	}

	public Service save(Service s) throws ServiceTransactionException {
		if (!em.getTransaction().isActive()) {
			em.clear();
			em.getTransaction().begin();
		}
		em.persist(s);
		em.getTransaction().commit();

		return s;
	}

	public List<Service> findByLocationAndKeyword(Long city, String keyword) {
		String query = "SELECT service FROM "
				+ Service.class.getSimpleName()
				+ " service WHERE (UPPER(service.name) LIKE :keyword OR UPPER(service.description) LIKE :keyword OR  UPPER(service.tags) LIKE :keyword) AND service.address.city.id = :city";
		TypedQuery<Service> typedQuery = em.createQuery(query, Service.class);
		typedQuery.setParameter("keyword", new String("%" + keyword + "%").toUpperCase());
		typedQuery.setParameter("city", city);
		List<Service> services = typedQuery.getResultList();
		ordenarPorMedia(services);
		return services;
	}

	private void ordenarPorMedia(List<Service> services) {
		for (Service service : services) {
			service.setMedia(getMediaEvaluates(service));
		}
		Collections.sort(services);
	}

	public boolean removeAllServicesTo(Long userId) {
		List<Service> services = getAllServicesToUser(userId);

		try {
			if (!em.getTransaction().isActive()) {
				em.clear();
				em.getTransaction().begin();
			}
			for (Service s : services) {
				EvaluateDAO.getInstance().removeEvaluatesOfService(s.getId());
				em.remove(em.merge(s));
			}
			em.getTransaction().commit();

		} catch (Exception t) {
			// t.printStackTrace();
			return false;
		}
		return true;
	}

	private Float getMediaEvaluates(Service service) {
		String query = "SELECT AVG(evaluate.note) FROM " + Evaluate.class.getSimpleName() + " evaluate WHERE evaluate.service = :service";
		TypedQuery<Double> typedQuery = em.createQuery(query, Double.class);
		typedQuery.setParameter("service", service);
		Double singleResult = typedQuery.getSingleResult();
		return singleResult == null ? 0 : singleResult.floatValue();
	}

	public List<Evaluate> getAllEvaluatesToService(Long service_id) {
		String hql = "FROM " + Evaluate.class.getSimpleName() + " WHERE service.id = " + service_id;
		TypedQuery<Evaluate> query = em.createQuery(hql, Evaluate.class);
		return query.getResultList();
	}
	
	public void closeConnection() {
		em.close();
		EntityFactory.getInstance().close();
	}
}
