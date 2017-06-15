package br.com.addvisor.webservice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.addvisor.webservice.exceptions.EvaluateTransactionException;
import br.com.addvisor.webservice.models.pojo.Evaluate;
import br.com.addvisor.webservice.models.pojo.Service;
import br.com.addvisor.webservice.models.pojo.User;
import br.com.addvisor.webservice.util.EntityFactory;

public class EvaluateDAO {

	private static EvaluateDAO evaluateDAO;

	private EntityManager em;

	private EvaluateDAO() {
		em = EntityFactory.getInstance().createEntityManager();
	}

	public static EvaluateDAO getInstance() {
		if (evaluateDAO == null) {
			evaluateDAO = new EvaluateDAO();
		}
		return evaluateDAO;
	}

	public boolean removeEvaluatesBy(Service s) throws EvaluateTransactionException {
		try {
			if (!em.getTransaction().isActive()) {
				em.clear();
				em.getTransaction().begin();
			}
			String removeServiceSql = "DELETE FROM " + Evaluate.class.getSimpleName() + " WHERE service.id = :id";
			em.createQuery(removeServiceSql).setParameter("id", s.getId()).executeUpdate();
			em.getTransaction().commit();
		} catch (Exception t) {
			throw new EvaluateTransactionException(t.getMessage());
		}
		return true;
	}

	public void removeEvaluatesBy(List<Service> services) throws EvaluateTransactionException {
		try {
			if (!em.getTransaction().isActive()) {
				em.clear();
				em.getTransaction().begin();
			}
			for (Service s : services) {
				String removeServiceSql = "DELETE FROM " + Evaluate.class.getSimpleName() + " WHERE service.id = :id";
				em.createQuery(removeServiceSql).setParameter("id", s.getId()).executeUpdate();
			}
			em.getTransaction().commit();
		} catch (Exception t) {
			throw new EvaluateTransactionException(t.getMessage());

		}
	}

	public void removeEvaluatesBy(Long userId) throws EvaluateTransactionException {
		try {
			if (!em.getTransaction().isActive()) {
				em.clear();
				em.getTransaction().begin();
			}
			String removeUserSql = "DELETE FROM " + Evaluate.class.getSimpleName() + " WHERE user.id = :id";
			em.createQuery(removeUserSql).setParameter("id", userId).executeUpdate();
			em.getTransaction().commit();
		} catch (Exception t) {
			throw new EvaluateTransactionException(t.getMessage());
		}
	}

	public List<Evaluate> getAllEvaluatesTo(Long userId) {
		String sql = "FROM " + Evaluate.class.getSimpleName() + " WHERE user.id = '" + userId + "'";
		TypedQuery<Evaluate> query = em.createQuery(sql, Evaluate.class);
		return query.getResultList();
	}

	public boolean removeEvaluatesOfService(Long serviceId) {
		try {
			if (!em.getTransaction().isActive()) {
				em.clear();
				em.getTransaction().begin();
			}
			String removeEvaluates = "DELETE FROM " + Evaluate.class.getSimpleName() + " WHERE service.id = :service_id";
			em.createQuery(removeEvaluates).setParameter("service_id", serviceId).executeUpdate();
			em.getTransaction().commit();
		} catch (Exception t) {
			// t.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean addEvaluate(Long userId, Long serviceId, Evaluate e) throws EvaluateTransactionException {

		Service service = ServiceDAO.getInstance().findServiceBy(serviceId);
		User user = UserDAO.getInstance().findUserBy(userId);

		if (service == null || user == null) {
			return false;
		}

		e.setUser(user);
		e.setService(service);

		try {
			if (!em.getTransaction().isActive()) {
				em.clear();
				em.getTransaction().begin();
			}
			em.merge(e);
			em.getTransaction().commit();
		} catch (Exception t) {
			throw new EvaluateTransactionException("Avaliação não pode ser adicionada");
		}

		return true;

	}

	public void closeConnection() {
		EntityFactory.getInstance().close();
	}
}
