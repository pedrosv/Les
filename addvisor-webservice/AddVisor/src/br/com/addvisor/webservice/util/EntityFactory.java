package br.com.addvisor.webservice.util;

import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactory {

	private static EntityFactory instance;
	private EntityManagerFactory entityManagerFactory;

	private EntityFactory() {
		entityManagerFactory = Persistence.createEntityManagerFactory(Constants.PERSISTENCE_UNIT);
	}

	public static EntityFactory getInstance() {
		if (instance == null) {
			instance = new EntityFactory();
		}
		return instance;
	}

	public EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	@PreDestroy
	public void close() {
		if (entityManagerFactory.isOpen()) {
			entityManagerFactory.close();
		}
	}
}
