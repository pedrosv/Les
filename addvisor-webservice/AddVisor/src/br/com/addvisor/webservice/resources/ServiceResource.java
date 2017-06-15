package br.com.addvisor.webservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.addvisor.webservice.dao.EvaluateDAO;
import br.com.addvisor.webservice.dao.ServiceDAO;
import br.com.addvisor.webservice.exceptions.EvaluateTransactionException;
import br.com.addvisor.webservice.exceptions.ServiceTransactionException;
import br.com.addvisor.webservice.models.pojo.Agenda;
import br.com.addvisor.webservice.models.pojo.City;
import br.com.addvisor.webservice.models.pojo.Evaluate;
import br.com.addvisor.webservice.models.pojo.Service;
import br.com.addvisor.webservice.models.pojo.enums.ServiceCat;

@Path("service")
public class ServiceResource {

	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/updateService")
	public Service updateService(Service service) {
		return ServiceDAO.getInstance().update(service);
	}

	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.TEXT_PLAIN)
	@Path("/removeService")
	public String removeService(Service service) {
		return String.valueOf(ServiceDAO.getInstance().remove(service));
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addService")
	public Service addService(Service service) {
		try {
			return ServiceDAO.getInstance().save(service);
		} catch (ServiceTransactionException e) {
			return null;
		}
	}

	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/searchRecommendServices/{city_id}")
	public List<Service> searchServicesTopRated(@PathParam("city_id") Long cityId,  Agenda agenda) {
		return ServiceDAO.getInstance().searchServicesTopRated(cityId, agenda.getNumbers());
	}

	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.TEXT_PLAIN)
	@Path("/addEvaluate/{user_id}&{service_id}")
	public String addEvaluate(@PathParam("user_id") Long user_id, @PathParam("service_id") Long service_id, Evaluate e) {
		try {
			return String.valueOf(EvaluateDAO.getInstance().addEvaluate(user_id, service_id, e));
		} catch (EvaluateTransactionException e1) {
			return String.valueOf(false);
		}
	}

	@GET
	@Consumes(value = MediaType.TEXT_PLAIN)
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/allServicesToUser/{user_id}")
	public List<Service> getAllServices(@PathParam("user_id") Long userId) {
		return ServiceDAO.getInstance().getAllServicesToUser(userId);
	}
	
	@GET
	@Consumes(value = MediaType.TEXT_PLAIN)
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/allEvaluatesToService/{service_id}")
	public List<Evaluate> getAllEvaluatesToService(@PathParam("service_id") Long service_id) {
		return ServiceDAO.getInstance().getAllEvaluatesToService(service_id);
	}

	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/getCategories")
	public ServiceCat[] getCategorias() {
		return ServiceCat.values();
	}

	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("getByCategory/{city}")
	public List<Service> getServicesByCategoria(@PathParam("city") Long city, ServiceCat categoria) {
		return ServiceDAO.getInstance().findByLocationAndCategory(city, categoria);
	}

	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("getByKeyword/{city}")
	public List<Service> getServicesByKeyword(@PathParam("city") Long city, String keyword) {
		return ServiceDAO.getInstance().findByLocationAndKeyword(city, keyword);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/allLocations")
	public List<City> getAllLocations() {
		return ServiceDAO.getInstance().getAllLocations();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/allServicesCity")
	public List<Service> getServicesToCity(City city) {
		return ServiceDAO.getInstance().getAllServicesToCity(city);
	}

	@GET
	@Path("teste")
	public Response teste() {
		return Response.ok("Servidor online!").build();
	}
}
