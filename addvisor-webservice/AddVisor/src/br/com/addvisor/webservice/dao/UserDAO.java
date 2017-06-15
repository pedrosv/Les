package br.com.addvisor.webservice.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.addvisor.webservice.exceptions.EvaluateTransactionException;
import br.com.addvisor.webservice.exceptions.UserTransactionException;
import br.com.addvisor.webservice.models.pojo.User;
import br.com.addvisor.webservice.util.EntityFactory;

public class UserDAO {
	
	private static UserDAO ud;
	private EntityManager em;
	
	private UserDAO(){
		em = EntityFactory.getInstance().createEntityManager();
	}
	
	public static UserDAO getInstance(){
		if(ud == null){
			ud = new UserDAO();
		}
		return ud;
	}
	
	public User findUserBy(String phone) {
	   	String userExists = "FROM " + User.class.getSimpleName() + " where phone = '" + phone + "'";
	    return executeQuery(userExists);
	}
	
	public User findUserBy(Long userId) {
	   	String userExists = "FROM " + User.class.getSimpleName() + " where id = '" + userId + "'";
	    return executeQuery(userExists);
	}
	
	public User save(User user) throws UserTransactionException{
		try{
			if(!em.getTransaction().isActive()){
				em.clear();
				em.getTransaction().begin();
			}
			em.persist(user);
			em.getTransaction().commit();
		}catch(Exception t){
			throw new UserTransactionException("Usuário não pode ser salvo. Informações inválidas");
		}
		return user;
	}
	
	public User update(User newUser) throws UserTransactionException {
		User updateUser = null;
		try{
			if(!em.getTransaction().isActive()){
				em.clear();
				em.getTransaction().begin();
			}
			updateUser = em.merge(newUser);
			em.getTransaction().commit();
		}catch(Exception t){
			throw new UserTransactionException("Usuário não pôde ser atualizado");
		}
		
		return updateUser;
	}
	
	public boolean remove(Long userId) throws UserTransactionException {
		User user = findUserBy(userId);
		if( user == null){
			throw new UserTransactionException("Usuário não existe!");
		}
		try {
			EvaluateDAO.getInstance().removeEvaluatesBy(userId);
			ServiceDAO.getInstance().removeAllServicesTo(userId);
			if(!em.getTransaction().isActive()){
				em.clear();
				em.getTransaction().begin();
			}
			em.remove(em.contains(user)? user : em.merge(user));
			em.getTransaction().commit();
		} catch (EvaluateTransactionException e) {
			return false;
		}
		
		return true;
		
	}
	private User executeQuery(String query) {
		TypedQuery<User> q = em.createQuery(query, User.class);
        User result = null;
        try {
            result = q.getSingleResult();
        } catch (NoResultException e) {
            result = null;
        }
        return result;
	}
	
	public void closeConnection(){
		em.close();
		EntityFactory.getInstance().close();
	}

}
