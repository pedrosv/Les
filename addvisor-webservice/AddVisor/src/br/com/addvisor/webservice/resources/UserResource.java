package br.com.addvisor.webservice.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.addvisor.webservice.dao.UserDAO;
import br.com.addvisor.webservice.exceptions.UserTransactionException;
import br.com.addvisor.webservice.models.pojo.User;

@Path("user")
public class UserResource {

	/**
	 * 
	 * @param user
	 *            Is the new added user
	 * @return the new added user
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addUser")
	public User addUser(User user) {
		User newUser = null;
		try {
			newUser = UserDAO.getInstance().save(user);
			return newUser;
		} catch (UserTransactionException e) {
			return null;
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/updateUser")
	public User updateUser(User newUser) {
		if (newUser.getId() == null) {
			return null;
		}
		try {
			return UserDAO.getInstance().update(newUser);
		} catch (UserTransactionException e) {
			return null;
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/removeUser/{user_id}")
	public String removeUser(@PathParam("user_id") Long userId) {
		try {
			return String.valueOf(UserDAO.getInstance().remove(userId));
		} catch (UserTransactionException e) {
			return String.valueOf(false);
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/authenticateUser")
	public User authenticateUser(User credentials) {

		try {
			User user = UserDAO.getInstance().findUserBy(credentials.getPhone());
			if (user.authenticatePassword(credentials.getPassword())) {
				return user;
			}

		} catch (NullPointerException e) {
			return null;
		}
		return null;
	}
}