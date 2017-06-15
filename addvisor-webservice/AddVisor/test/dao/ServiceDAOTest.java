package dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.addvisor.webservice.dao.EvaluateDAO;
import br.com.addvisor.webservice.dao.LocationDAO;
import br.com.addvisor.webservice.dao.ServiceDAO;
import br.com.addvisor.webservice.exceptions.ServiceTransactionException;
import br.com.addvisor.webservice.models.pojo.Address;
import br.com.addvisor.webservice.models.pojo.City;
import br.com.addvisor.webservice.models.pojo.Evaluate;
import br.com.addvisor.webservice.models.pojo.Service;

public class ServiceDAOTest {
	
	private Service s1,s2, s3,s4, s5, s6, s7, s8, s9, s10,s11, s12;
	@Before
	public void testaPesquisarUsuarioPeloId(){
		s1 = ServiceDAO.getInstance().findServiceBy((long)656);
		s2 = ServiceDAO.getInstance().findServiceBy((long)658);
		s3 = ServiceDAO.getInstance().findServiceBy((long)660);
		s4 = ServiceDAO.getInstance().findServiceBy((long)662);
		s5 = ServiceDAO.getInstance().findServiceBy((long)664);
		s6 = ServiceDAO.getInstance().findServiceBy((long)666);
		s7 = ServiceDAO.getInstance().findServiceBy((long)668);
		s8 = ServiceDAO.getInstance().findServiceBy((long)670);
		s9 = ServiceDAO.getInstance().findServiceBy((long)672);
		s10 = ServiceDAO.getInstance().findServiceBy((long)674);
		s11 = ServiceDAO.getInstance().findServiceBy((long)676);
		s12 = ServiceDAO.getInstance().findServiceBy((long)678);
		Assert.assertFalse(s1 == null || s2 == null || s3 == null || s4 == null || s5 == null ||
				s6 == null || s8 == null || s10 == null || s11 == null || s12 == null);
	}
	
	public void TestaAtualizarServicos(){
		s1.setName("Conserta tudo");
		List<String> phones = new ArrayList<String>();
		phones.add("(83) 88566398");
		s1.setPhones(phones);
		Service se = ServiceDAO.getInstance().update(s1);
		if(!se.getId().equals(s1.getId())){
			Assert.fail();
		}
		if(!se.getName().equals(s1.getName())){
			Assert.fail();
		}
		if(!se.getPhones().contains("(83) 88566398")){
			Assert.fail();
		}
		s1 = se;
		
		s2.setAddress(getAddress2());
		ServiceDAO.getInstance().update(s2);
		
		/*List<Service> services = ServiceDAO.getInstance().getAllServicesToUser(u2.getId());
		if(services.size() != 2){
			Assert.fail();
		}*/
		
		List<Service> services9 = ServiceDAO.getInstance().getAllServicesToCity(getAddress2().getCity());
		
		try {
			ServiceDAO.getInstance().save(s9);
		} catch (ServiceTransactionException e) {
			e.printStackTrace();
		}
		
		List<Service> services10 = ServiceDAO.getInstance().getAllServicesToCity(getAddress2().getCity());
		for(Service s : services10){
			System.out.println(s.getName());
		}
		
		/*List<Service> services11 = ServiceDAO.getInstance().getAllServicesToUser(u5.getId());
		if(services11.isEmpty()){
			Assert.fail();
		}*/
		List<String> phones12 = new ArrayList<String>();
		phones12.add("(52) 89688985");
		phones12.add("(88) 99586458");
		phones12.add("(83) 99632334");
		phones12.add("(83) 81126120");
		
		List<Service> services12 = ServiceDAO.getInstance().searchServicesTopRated((long)336, phones12);
		for(Service serv12 : services12){
			System.out.println(serv12.getName());
		}
		
		testaSeOsServicosRecomendadosPelosAmigosSaoRetornados();
		
	}

	public void testaSeTodasAsLocalidadesSaoRetornadasCorretamente() {
		List<City> locations = ServiceDAO.getInstance().getAllLocations();
		
		for(City c : locations){
			System.out.println(c.getName() + " " + c.getState().getName() + " " + c.getState().getCountry().getName());
		}
	}

	private Address getAddress1(){
		Address ad = new Address();
		City  c = LocationDAO.getInstance().getCity((long)2610);
		ad.setCity(c);
		return ad;
	}
	
	private Address getAddress2(){
		Address ad = new Address();
		City c = LocationDAO.getInstance().getCity((long)3);
		ad.setCity(c);
		return ad;
	}
	
	public void testaSeAsAvaliacoesSaoRetornadasCorretamente(){
		List<Evaluate> evaluates = ServiceDAO.getInstance().getAllEvaluatesToService(s2.getId());
		Assert.assertTrue(evaluates.size() == 3);
	}
	
	public void testaSeOsServicosRelacionadasADeterminadaCidadeSaoRetornadosCorretamente() {
		List<Service> services = ServiceDAO.getInstance().getAllServicesToCity(getAddress1().getCity());
		
		for(Service s : services){
			System.out.println(s.getName());
		}
		
		
	//	ServiceDAO.getInstance().remove(u4.getId(), s5);
		
	}
	
	@Test
	public void testaSeOsServicosRecomendadosPelosAmigosSaoRetornados(){
		
		List<String> phones = new ArrayList<String>();
		phones.add("(83) 91121314"); // u
		phones.add("(83) 81126120"); // u2
		phones.add("(82) 88552564"); // u3
		phones.add("(83) 99876352"); // não cadastrado
		List<Service> services = null;
		try{
			services = ServiceDAO.getInstance().searchServicesTopRated((long)2610, phones);
			List<Service> expectedServices = new LinkedList<Service>();
			expectedServices.add(s1);
			expectedServices.add(s2);
			expectedServices.add(s4);
			Assert.assertEquals(services, expectedServices);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		List<Service> s3 = ServiceDAO.getInstance().searchServicesTopRated((long)2610,new ArrayList<String>());
		if(!s3.isEmpty()){
			Assert.fail();
		}
		
		List<Service> s4 = ServiceDAO.getInstance().searchServicesTopRated((long)2610, null);
		if(!s4.isEmpty()){
			Assert.fail();
		}
		
	}
	
	public void testaSeOsServicosCadastradosPorUmUsuarioSaoRetornadosCorretamente(){
		
	}
	

	@SuppressWarnings("unused")
	private List<Service> testSet1(){
		List<Service> services = new LinkedList<>();
		services.add(new Service());
		return services;
	}
	
	
	
	public void getAllServices(){
		
	}
	
	public void getMostRecommendService(){
		
	}
	
}
