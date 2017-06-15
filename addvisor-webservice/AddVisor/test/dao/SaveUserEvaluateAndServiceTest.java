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
import br.com.addvisor.webservice.dao.UserDAO;
import br.com.addvisor.webservice.exceptions.EvaluateTransactionException;
import br.com.addvisor.webservice.exceptions.ServiceTransactionException;
import br.com.addvisor.webservice.exceptions.UserTransactionException;
import br.com.addvisor.webservice.models.pojo.Address;
import br.com.addvisor.webservice.models.pojo.City;
import br.com.addvisor.webservice.models.pojo.Evaluate;
import br.com.addvisor.webservice.models.pojo.Service;
import br.com.addvisor.webservice.models.pojo.User;

public class SaveUserEvaluateAndServiceTest {
	
	private User u, u2, u3, u4, u5, u6, u7, u8, u10, u11, u12, u13, u14;
	private Service s1,s2, s3,s4, s5, s6, s7, s8, s9, s10, s11, s12;
	
	@Before
	public void testaAdicionarUsuario(){
		u = new User();
		u.setName("Bruno Rafael Araujo Vasconcelos");
		u.setEmail("bruno.rafael.vasconcelos@ccc.ufcg.edu.br");
		u.setPassword("4565");
		u.setPhone("(83) 91121314");
		u.setCity(getCampinaGrandeCity());
		
		u2 = new User();
		u2.setName("Bianca Souza da Silva");
		u2.setEmail("biasouza.bruno@gmail.com");
		u2.setPassword("45698");
		u2.setPhone("(83) 81126120");
		u2.setCity(getCampinaGrandeCity());
		
		u3 = new User();
		u3.setName("Rodrigo Tavares de Melo");
		u3.setEmail("rodrigotm@gmail.com");
		u3.setPassword("45897");
		u3.setPhone("(82) 88552564");
		u3.setCity(getCampinaGrandeCity());
		
		u4 = new User();
		u4.setName("Pedro henriques de Oliveira");
		u4.setEmail("pedrao@gmail.com");
		u4.setPassword("45698");
		u4.setPhone("(52) 89688985");
		u4.setCity(getOuroCity());
				
		u5 = new User();
		u5.setName("Fernando Sabiï¿½ Sabio da Silva");
		u5.setEmail("piupiu@gmail.com");
		u5.setPassword("45698");
		u5.setPhone("(83) 81887070");
		u5.setCity(getTupiramaCity());
			
		u6 = new User();
		u6.setName("Marta Albuquerque Medeiros");
		u6.setEmail("malbume.bruno@gmail.com");
		u6.setPassword("675584");
		u6.setPhone("(83) 82665593");
		u6.setCity(getPocinhosCity());
			
		u7 = new User();
		u7.setName("Marta Albuquerque Medeiros");
		u7.setEmail("malbume.bruno@gmail.com");
		u7.setPassword("786594");
		u7.setPhone("(83) 88665566");
		u7.setCity(getPocinhosCity());
		
		u8 = new User();
		u8.setName("Ricardo Abumussa de Castro");
		u8.setEmail("ricadc@gmail.com");
		u8.setPassword("67uutii");
		u8.setPhone("(83) 99632334");
		u8.setCity(getTupiramaCity());
				
		u10 = new User();
		u10.setEmail("afrofildo@gmail.com");
		u10.setName("Afrofildo Gomes Teixeira");
		u10.setPhone("(56) 99886655");
		u10.setPassword("454hj");
		u10.setCity(getPocinhosCity());

		u11 = new User();
		u11.setName("David Albuquerque Medeiros");
		u11.setEmail("david.carlos@gmail.com");
		u11.setPassword("del87poi");
		u11.setPhone("(83) 99886655");
		u11.setCity(getJoaoPessoaCity());

		u12 = new User();
		u12.setName("Carlos Xavier Gomes Da silva");
		u12.setEmail("carlosxgs.more@gmail.com");
		u12.setPassword("ghu99lï¿½");
		u12.setPhone("(88) 91558877");
		u12.setCity(getOuroCity());

				//permite que um usuario se cadastre com dois nï¿½meros diferentes
		u13 = new User();
		u13.setName("Carlos Xavier Gomes Da silva");
		u13.setEmail("carlosxgs.more@gmail.com");
		u13.setPassword("ghu99lï¿½");
		u13.setPhone("(88) 99586458");
		u13.setCity(getJoaoPessoaCity());
		
				//Nï¿½o permite que usuï¿½rios diferentes se cadastre com o mesmo nï¿½mero
		u14 = new User();
		u14.setName("Paula Beatriz Nobrega");
		u14.setEmail("paulabn.btf@gmail.com");
		u14.setPassword("8pposyd");
		u14.setPhone("(88) 99586858");
		u14.setCity(getJoaoPessoaCity());
	
		try {
			u = UserDAO.getInstance().save(u);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		
		try {
			u2 = UserDAO.getInstance().save(u2);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		try {
			u3 = UserDAO.getInstance().save(u3);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		try {
			u4 = UserDAO.getInstance().save(u4);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		try {
			u5 = UserDAO.getInstance().save(u5);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		try {
			u6 = UserDAO.getInstance().save(u6);
		} catch (UserTransactionException e1) {
			e1.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		try {
			u7 = UserDAO.getInstance().save(u7);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		try {
			u8 = UserDAO.getInstance().save(u8);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		try {
			u10 = UserDAO.getInstance().save(u10);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		
		try {
			u11 = UserDAO.getInstance().save(u11);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		
		try {
			u12 = UserDAO.getInstance().save(u12);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		
		try {
			u13 = UserDAO.getInstance().save(u13);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		
		try {
			u14 = UserDAO.getInstance().save(u14);
		} catch (UserTransactionException e) {
			e.printStackTrace();
			Assert.fail("Não devia ter lançado Exceção");
		}
		testaAdicionarServico();
	}
	
	public void testaAdicionarServico(){
		s1 = new Service();
		s1.setDescription("Serviï¿½o de manutenï¿½ï¿½o de aparelhos domï¿½sticos. Consertamos dvd's, aparelhos de som, televisores, ventiladores, etc");
		s1.setName("Naldinho consertos em geral");
		List<String> p1 = new LinkedList<String>();
		p1.add("(83) 81887070");
		s1.setUser(u);
		s1.setPhones(p1);
		s1.setAddress(getAddress1());
			
		s2 = new Service();
		s2.setDescription("Professor Bugiganga é formado em computação pela"
			+ " universidade estadual da paraíba. Aulas particulares, "
			+ "palestras e resoluções online de exercícios.");
		s2.setName("Professor Bugiganga aulas particulares de computação");
		List<String> p2 = new LinkedList<String>();
		p2.add("(83) 81887070");
		s2.setUser(u2);
		s2.setPhones(p2);
		s2.setAddress(getAddress1());
		
		s3 = new Service();
		s3.setDescription("O bar do cuscuz é um restaurante muito conceituado na "
				+ "cidade de Campina grande. Oferecemos comidas típicas e pratos "
				+ "maravilhosos de dar água na boca, estamos esperando por você!");
		s3.setName("Bar do Cuscuz");
		List<String> p3 = new LinkedList<String>();
		p3.add("(83) 81887070");
		s3.setUser(u3);
		s3.setPhones(p3);
		s3.setAddress(getAddress1());
			
		s4 = new Service();
		s4.setDescription("Pet show oferece a você comodidade e tranquilidade "
				+ "na hora de cuidar do seu bichinho, ficamos satisfeitos em "
				+ "lhe atender pelo menor preço e com o maior benefício possível.");
		s4.setName("Pet show, a serviço do seu bichinho");
		List<String> p4 = new LinkedList<String>();
		p4.add("(82) 91552247");
		s4.setUser(u4);
		s4.setPhones(p4);
		s4.setAddress(getAddress2());
			
		s5 = new Service();
		s5.setName("Maguilinha Cabeleireiro");
		s5.setDescription("Cortamos cabelos masculinos a mais de 10 anos com uma "
				+ "precisão e satisfação muito grande dos nosso clientes. "
				+ "Por apenas 10 reais corte seu cabelo e pele sua barba!"
				+ "Estamos disponï¿½veis de segunda a sabado das 8 às 18");
			
		List<String> p5 = new ArrayList<String>();
		p5.add("(83) 81225696");
		s5.setUser(u2);
		s5.setPhones(p5);
		s5.setAddress(getAddress2());
			
		s6 = new Service();
		s6.setName("Amarelinho chaveiro");
		s6.setDescription("Trabalhamos 24 horas, socorremos você quando precisar!");
		List<String> p6 = new ArrayList<String>();
		p6.add("(83) 93526879");
		s6.setUser(u4);
		s6.setPhones(p6);
		s6.setAddress(getAddress2());

		s7 = new Service();
		s7.setName("MRV imobiliária");
		s7.setDescription("Venha conhecer as facilidades da MRV na compra de "
				+ "apartamentos ou casas, tudo de primeira qualidade e com muito "
				+ "conforto. Venha conquistar o sonho da casa própria!");
		List<String> p7 = new ArrayList<String>();
		p7.add("(83) 88669658");
		s7.setUser(u5);
		s7.setPhones(p7);
		s7.setAddress(getAddress3());
				
		s8 = new Service();
		s8.setName("BMD imï¿½veis");
		s8.setDescription("Venha conhecer as facilidades da BMD na compra de "
				+ "apartamentos ou casas, tudo de primeira qualidade e com muito "
				+ "conforto. Venha conquistar o sonho da casa própria!");
		List<String> p8 = new ArrayList<String>();
		p8.add("(83) 95668698");
		s8.setUser(u6);
		s8.setPhones(p8);
		s8.setAddress(getAddress3());
			
		s9 = new Service();
		s9.setName("Instalador de antenas Robinho");
		s9.setDescription("Montador de antenas de apartamentos, casas e etc");
		List<String> p9 = new ArrayList<String>();
		p9.add("(83) 88552266");
		s9.setUser(u7);
		s9.setPhones(p9);
		s9.setAddress(getAddress3());
		
		s10 = new Service();
		s10.setName("Encanador Roberto Souto");
		s10.setDescription("Desentupindo os canos mais profundos da sua casa");
		List<String> p10 = new ArrayList<String>();
		p10.add("(83) 93333333");
		s10.setUser(u8);
		s10.setPhones(p10);
		s10.setAddress(getAddress4());
		
		s11 = new Service();
		s11.setName("Mecânico de motocicletas Tulio");
		s11.setDescription("Atendimento de seg a sexta das 8 as 16 em qualquer lugar da cidade podemos te atender, sou o amigo das estradas");
		List<String> p11 = new ArrayList<String>();
		p11.add("(83) 97100025");
		s11.setUser(u8);
		s11.setPhones(p11);
		s11.setAddress(getAddress4());
		
		s12 = new Service();
		s12.setName("Wilson Marceneiro");
		s12.setDescription("Serviços de marcenaria em geral. Montamos na sua casa!");
		List<String> p12 = new ArrayList<String>();
		p12.add("(83) 88552260");
		s12.setUser(u5);
		s12.setPhones(p12);
		s12.setAddress(getAddress4());
		
		try {
			s1 = ServiceDAO.getInstance().save(s1);
			Assert.assertFalse(s1 == null);
		} catch (Exception e1) {
			e1.printStackTrace();
			Assert.fail();
		}
		
		try {
			s2 = ServiceDAO.getInstance().save(s2);
			//Assert.assertFalse(s2 == null);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			s3 = ServiceDAO.getInstance().save( s3);
			Assert.assertFalse(s3 == null);
		} catch (ServiceTransactionException e1) {
			e1.printStackTrace();
		}

		try {
			s4 = ServiceDAO.getInstance().save(s4);
			Assert.assertFalse(s4 == null);
		} catch (ServiceTransactionException e1) {
			e1.printStackTrace();
		}

		try {
			s5 = ServiceDAO.getInstance().save(s5);
			Assert.assertFalse(s5 == null);
		} catch (ServiceTransactionException e1) {
			e1.printStackTrace();
		}
		
		try {
			s6 = ServiceDAO.getInstance().save(s6);
			Assert.assertFalse(s6 == null);
		} catch (ServiceTransactionException e1) {
			e1.printStackTrace();
		}
		
		try {
			s7 = ServiceDAO.getInstance().save(s7);
			Assert.assertFalse(s7 == null);
		} catch (ServiceTransactionException e) {
			Assert.fail();
			e.printStackTrace();
		} 
		
		try {
			s8 = ServiceDAO.getInstance().save(s8);
			Assert.assertFalse(s8 == null);
		} catch (ServiceTransactionException e) {
			Assert.fail();
			e.printStackTrace();
		} 
		
		try {
			s9 = ServiceDAO.getInstance().save(s9);
			Assert.assertFalse(s9 == null);
		} catch (ServiceTransactionException e) {
			Assert.fail();
			e.printStackTrace();
		}
		
		try {
			s10 = ServiceDAO.getInstance().save(s10);
			Assert.assertFalse(s10 == null);
		} catch (ServiceTransactionException e) {
			Assert.fail();
			e.printStackTrace();
		} 
		
		try {
			s11 = ServiceDAO.getInstance().save(s11);
			Assert.assertFalse(s11 == null);
		} catch (ServiceTransactionException e) {
			Assert.fail();
			e.printStackTrace();
		} 
		
		try {
			s12 = ServiceDAO.getInstance().save(s12);
			Assert.assertFalse(s12 == null);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	@Test
	public void testaAdicionarAvaliacao() {
		Evaluate e1 = new Evaluate(4f, "Recomendo, muito bom!");
		Evaluate e2 = new Evaluate(4f, "Muito bom os serviços, nota 10");
		Evaluate e3 = new Evaluate(1f, "Não gostei esperei muito tempo para poder ser atendido");
		Evaluate e4 = new Evaluate(4f, "Bacana, recomendo");
		Evaluate e5 = new Evaluate(2f, "Muito ruim, pï¿½ssimo atendimento");
		Evaluate e6 = new Evaluate(5f, "Muito Bom!");
		Evaluate e7 = new Evaluate(5f, "Recomendo!");
		Evaluate e8 = new Evaluate(4f, "Fantástico :D ! ");
		Evaluate e9 = new Evaluate(1f, "Nunca mais uso isso na minha vida!");
		Evaluate e10 = new Evaluate(4f, "Muito bom, inclusive o preço");
		Evaluate e11 = new Evaluate(2f, "");
		Evaluate e12 = new Evaluate(4f, "");
		Evaluate e13 = new Evaluate(4f, "ótimo, seria bacana se tivesse em minha cidade :D");
		
		try{
			EvaluateDAO.getInstance().addEvaluate(u.getId(), s3.getId(), e1);
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u2.getId(), s1.getId(), e2);
		} catch (EvaluateTransactionException e) {
			e.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u3.getId(), s4.getId(), e3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u3.getId(), s2.getId(), e4);
		} catch (EvaluateTransactionException e) {
			e.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u5.getId(), s6.getId(), e5);
		} catch (EvaluateTransactionException e14) {
			e14.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u6.getId(), s2.getId(), e6);
		} catch (EvaluateTransactionException e) {
			e.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u8.getId(), s5.getId(), e7);
		} catch (EvaluateTransactionException e) {
			e.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u5.getId(), s4.getId(), e8);
		} catch (EvaluateTransactionException e14) {
			e14.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u10.getId(), s1.getId(), e9);
		} catch (EvaluateTransactionException e) {
			e.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u4.getId(), s7.getId(), e10);
		} catch (EvaluateTransactionException e14) {
			e14.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u5.getId(), s6.getId(), e11);
		} catch (EvaluateTransactionException e) {
			e.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u8.getId(), s7.getId(), e12);
		} catch (EvaluateTransactionException e) {
			e.printStackTrace();
		}
		try {
			EvaluateDAO.getInstance().addEvaluate(u5.getId(), s4.getId(), e13);
		} catch (EvaluateTransactionException e) {
			e.printStackTrace();
		}
	}
	
	public City getJoaoPessoaCity(){
		return LocationDAO.getInstance().getCity((long)2655);
	}
	
	public City getCampinaGrandeCity(){
		return LocationDAO.getInstance().getCity((long)2610); 
	}
	
	public City getPocinhosCity(){
		return LocationDAO.getInstance().getCity((long)2708); 
	}
	
	public City getOuroCity(){
		return LocationDAO.getInstance().getCity((long)4589); 
	}
	
	public City getTupiramaCity(){
		return LocationDAO.getInstance().getCity((long)5561); 
	}
	
	public City getSaoPauloCity(){
		return LocationDAO.getInstance().getCity((long)5270); 
	}
	
	public City getRecifeCity(){
		return LocationDAO.getInstance().getCity((long)3315); 
	}
	
	public City getRioBrancoCity(){
		return LocationDAO.getInstance().getCity((long)94); 
	}
	
	private City getAmparoCity(){
		return LocationDAO.getInstance().getCity((long)2569);
	}
	
	private City getBaiaDaTraicaoCity(){
		return LocationDAO.getInstance().getCity((long)2579);
	}
	
	private Address getAddress1(){
		Address ad = new Address();
		ad.setCity(getCampinaGrandeCity());
		ad.setComplement("Próximo a praça da bandeira");
		ad.setLocation("Rua Floriano Peixoto, 126");
		return ad;
	}
	
	private Address getAddress2(){
		Address ad = new Address();
		ad.setCity(getTupiramaCity());
		return ad;
	}
	
	private Address getAddress3(){
		Address ad = new Address();
		ad.setCity(getJoaoPessoaCity());
		return ad;
	}
	
	private Address getAddress4(){
		Address ad = new Address();
		ad.setCity(getSaoPauloCity());
		return ad;
	}
	
	private Address getAddress5(){
		Address ad = new Address();
		ad.setCity(getRecifeCity());
		return ad;
	}
	
	private Address getAddress6(){
		Address ad = new Address();
		ad.setCity(getPocinhosCity());
		return ad;
	}
	
	private Address getAddress7(){
		Address ad = new Address();
		ad.setCity(getOuroCity());
		return ad;
	}
	
	private Address getAddress8(){
		Address ad = new Address();
		ad.setCity(getRioBrancoCity());
		ad.setComplement("Próximo ao peixotoCar");
		ad.setLocation("Rua Serverino da Silva, nº 169");
		return ad;
	}
}
