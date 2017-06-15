package dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.addvisor.webservice.dao.EvaluateDAO;
import br.com.addvisor.webservice.dao.LocationDAO;
import br.com.addvisor.webservice.dao.ServiceDAO;
import br.com.addvisor.webservice.dao.UserDAO;
import br.com.addvisor.webservice.exceptions.UserTransactionException;
import br.com.addvisor.webservice.models.pojo.City;
import br.com.addvisor.webservice.models.pojo.Evaluate;
import br.com.addvisor.webservice.models.pojo.Service;
import br.com.addvisor.webservice.models.pojo.User;
import br.com.addvisor.webservice.util.EntityFactory;

public class UserDAOTest {
	
    private User u, u2, u3, u4, u5, u6, u8, u10, u11, u12, u13, u14;
    
	@Test
	public void start(){
		testaPesquisarUsuarioPeloId();
		testaPesquisarUsuarioPeloPhone();
		testaSeUsuarioEhAdicionadoComParametrosInvalidos();
		testaSeUsuarioEhAtualizadoCorretamente();
		testaSeUsuarioEhRemovidoCorretamente();
		EntityFactory.getInstance().close();
	}

	private void testaPesquisarUsuarioPeloId(){
		u = UserDAO.getInstance().findUserBy((long)643);
		u2 = UserDAO.getInstance().findUserBy((long)644);
		u3 = UserDAO.getInstance().findUserBy((long)645);
		u4 = UserDAO.getInstance().findUserBy((long)646);
		u5 = UserDAO.getInstance().findUserBy((long)647);
		u6 = UserDAO.getInstance().findUserBy((long)648);
		u8 = UserDAO.getInstance().findUserBy((long)649);
		u8 = UserDAO.getInstance().findUserBy((long)650);
		u10 = UserDAO.getInstance().findUserBy((long)651);
		u11 = UserDAO.getInstance().findUserBy((long)652);
		u12 = UserDAO.getInstance().findUserBy((long)653);
		u13 = UserDAO.getInstance().findUserBy((long)654);
		u14 = UserDAO.getInstance().findUserBy((long)655);
		Assert.assertFalse(u == null || u2 == null || u3 == null || u4 == null || u5 == null ||
				u6 == null || u8 == null || u10 == null || u11 == null || u12 == null || u13==null || u14 == null);
	}
	
	private void testaPesquisarUsuarioPeloPhone(){
		
		User r1 = UserDAO.getInstance().findUserBy("(83) 91121314");
		User r2 = UserDAO.getInstance().findUserBy("(83) 81126120");
		User r3 = UserDAO.getInstance().findUserBy("(82) 88552564");
		User r4 = UserDAO.getInstance().findUserBy("(52) 89688985");
		User r5 = UserDAO.getInstance().findUserBy("(83) 81887070");
		User r6 = UserDAO.getInstance().findUserBy("(83) 82665593");
		User r7 = UserDAO.getInstance().findUserBy("(83) 88665566");
		User r8 = UserDAO.getInstance().findUserBy("(83) 99632334");
		User r9 = UserDAO.getInstance().findUserBy("(56) 99886655");
		User r10 = UserDAO.getInstance().findUserBy("(83) 99886655");
		User r11 = UserDAO.getInstance().findUserBy("(88) 91558877");
		User r12 = UserDAO.getInstance().findUserBy("(88) 99586458");
		User r13 = UserDAO.getInstance().findUserBy("(88) 99586858");
		
		Assert.assertFalse(r1 == null || r2 == null || r3 == null || r4 == null || r5 == null || r6 == null || 
		   r7 == null || r8 == null || r9 == null ||  r10 == null || r11 == null || r12 == null || r13 == null);
	}
	
	private void testaSeUsuarioEhAtualizadoCorretamente() {
		u.setEmail("bb.araujo@gmail.com");
		u.setCity(getAmparoCity());
		try {
			User result1 = UserDAO.getInstance().update(u);
			Assert.assertTrue("Usuário não pode ser atualizado!", u.equals(result1));
		} catch (UserTransactionException u) {
			Assert.fail("Usuário não pode ser atualizado");
		}
		
		u.setPhone("(83) 81020307");
		u.setName("Bruno Rafael A. Vasconcelos");
		try{
			User result2 = UserDAO.getInstance().update(u);
			Assert.assertTrue("O telefone e/ou o nome do usuário não pôde ser atualizado!", u.getPhone().equals(result2.getPhone()));
		}catch(UserTransactionException u){
			Assert.fail("Usuário não pôde ser atualizado");
		}
		
		u2.setName("Bianca Souza Vasconcelos");
		u2.setEmail("bb.bruno@gmail.com");
		try{
			User result3 = UserDAO.getInstance().update(u2);
			Assert.assertTrue("O nomr e/ou o email do usuário não pôde ser atualizado!", u2.equals(result3));
		}catch(UserTransactionException u){
			Assert.fail("Usuário não pôde ser atualizado");
		}
		
		u.setEmail("bruno.rafha@gmail.com");
		try{
			User result4 = UserDAO.getInstance().update(u);
			Assert.assertTrue("O nomr e/ou o email do usuário não pôde ser atualizado!", u.equals(result4));
		}catch(UserTransactionException u){
			Assert.fail("Usuário não pôde ser atualizado");
		}
		
		u3.setName("Rodrigo T. de Melo");
		String rodrigoPhone = u3.getPhone();
		u3.setPhone("(83) 97011049");
		try {
			
			User userResult5 = UserDAO.getInstance().update(u3);
			User findUser = UserDAO.getInstance().findUserBy(rodrigoPhone);
			Assert.assertTrue(findUser == null);
			Assert.assertTrue(u3.equals(userResult5));
			
		} catch (UserTransactionException e) {
			Assert.fail("Usuário não pôde ser atualizado");
		}
		
		u4.setCity(getBaiaDaTraicaoCity());
		try {
			User userResult6 = UserDAO.getInstance().update(u4);
			Assert.assertTrue("Nome da cidade não pôde ser atualizada para o usuário: " + u4.getName(), u4.equals(userResult6));
		} catch (UserTransactionException e) {
			Assert.fail("Usuário não pôde ser atualizado");
		}
		
	}
	
	public void testaSeUsuarioEhAdicionadoComParametrosInvalidos(){
		User u15 = new User();
		u15.setPhone("(83) 99886655"); // phone já existe
		u15.setName("David Albuquerque Medeiros");
		u15.setCity(getCampinaGrandeCity());
		u15.setPassword("12566");
		try {
			UserDAO.getInstance().save(u15);
			Assert.fail("IllegalArgumentException");
		} catch (UserTransactionException e) {
			//expect exception
		}
		
		User u18 = new User();
		u18.setName("Rodolfo Guedes de Antunes");
		u18.setEmail("r.antunes@gmail.com");
		u18.setPhone("(56) 89665014");
		u18.setPassword("1111"); // cadê a cidade?
		try {
			UserDAO.getInstance().save(u18);
			Assert.fail("IllegalArgumentException");
		} catch (UserTransactionException e) {
			//expect exception
		}
		
		User u19 = new User();
		u19.setEmail("fael.gusmao@gmail.com");
		u19.setPhone("(56) 82674007");
		u19.setPassword("125662");//cadê o nome?
		try {
			UserDAO.getInstance().save(u19);
			Assert.fail("IllegalArgumentException");
		} catch (UserTransactionException e) {
			//expect exception
		}
		
		User u21 = new User();
		u21.setName("Rodolfo Guedes de Antunes");
		u21.setEmail("r.antunes2@gmail.com");
		u21.setPhone("(25) 82674007");//phone repetido
		u21.setPassword("12566");
		u21.setCity(getBaiaDaTraicaoCity());
		//mesmos dados com email diferente
		try {
			UserDAO.getInstance().save(u21);
			Assert.fail("IllegalArgumentException");
		} catch (UserTransactionException e) {
			//expect exception
		}
	}
	
	public void testaSeUsuarioEhRemovidoCorretamente(){
		UserDAO userDAO = UserDAO.getInstance();
		
		try{
			List<Service> services = ServiceDAO.getInstance().getAllServicesToUser(u12.getId());
			List<Evaluate> evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u12.getId());
			Assert.assertTrue(services.isEmpty());
			Assert.assertTrue(evaluates.isEmpty());
			
			userDAO.remove(u12.getId());//usuário sem ambos
			Assert.assertFalse(userDAO.findUserBy(u12.getId()) == null);//verifica se usuário foi removido
			
			services = ServiceDAO.getInstance().getAllServicesToUser(u12.getId());//busca outra vez pelos serviços do usuário
			evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u12.getId());//busca outra vez pelas avaliações do usuário
			Assert.assertTrue(services.isEmpty());
			Assert.assertTrue(evaluates.isEmpty());
			
		}catch(UserTransactionException e){
			Assert.fail("Não deveria ter lançado exceção");
		}
		
		
		try{
			List<Service> services = ServiceDAO.getInstance().getAllServicesToUser(u3.getId());
			List<Evaluate> evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u3.getId());
			Assert.assertTrue(services.isEmpty());
			Assert.assertFalse(evaluates.isEmpty());
			
			userDAO.remove(u3.getId());//usuário apenas com avaliaçõs
			Assert.assertFalse(userDAO.findUserBy(u3.getId()) == null);
			
			services = ServiceDAO.getInstance().getAllServicesToUser(u3.getId());
			evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u3.getId());
			Assert.assertTrue(services.isEmpty());
			Assert.assertTrue(evaluates.isEmpty());
			
		}catch(UserTransactionException e){
			Assert.fail("Não deveria ter lançado exceção");
		}
		
		
		try{
			List<Service> services = ServiceDAO.getInstance().getAllServicesToUser(u10.getId());
			List<Evaluate> evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u10.getId());
			Assert.assertTrue(services.isEmpty());
			Assert.assertFalse(evaluates.isEmpty());
			
			userDAO.remove(u10.getId());//usuário apenas com avaliaçõs
			Assert.assertFalse(userDAO.findUserBy(u10.getId()) == null);
			
			services = ServiceDAO.getInstance().getAllServicesToUser(u10.getId());
			evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u10.getId());
			Assert.assertTrue(services.isEmpty());
			Assert.assertTrue(evaluates.isEmpty());
			
		}catch(UserTransactionException e){
			Assert.fail("Não deveria ter lançado exceção");
		}
		
		
		try{
			List<Service> services = ServiceDAO.getInstance().getAllServicesToUser(u14.getId());
			List<Evaluate> evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u14.getId());
			Assert.assertFalse(services.isEmpty());
			Assert.assertTrue(evaluates.isEmpty());
			
			userDAO.remove(u14.getId());//usuário apenas com serviços
			Assert.assertFalse(userDAO.findUserBy(u14.getId()) == null);
			
			services = ServiceDAO.getInstance().getAllServicesToUser(u14.getId());
			evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u14.getId());
			Assert.assertTrue(services.isEmpty());
			Assert.assertTrue(evaluates.isEmpty());
			
		}catch(UserTransactionException e){
			Assert.fail("Não deveria ter lançado exceção");
		}
		
		
		try{
			List<Service> services = ServiceDAO.getInstance().getAllServicesToUser(u4.getId());
			List<Evaluate> evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u4.getId());
			Assert.assertFalse(services.isEmpty());
			Assert.assertFalse(evaluates.isEmpty());
			
			userDAO.remove(u4.getId());//usuário com ambos
			Assert.assertFalse(userDAO.findUserBy(u4.getId()) == null);
			
			services = ServiceDAO.getInstance().getAllServicesToUser(u4.getId());
			evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u4.getId());
			Assert.assertTrue(services.isEmpty());
			Assert.assertTrue(evaluates.isEmpty());
			
		}catch(UserTransactionException e){
			Assert.fail("Não deveria ter lançado exceção");
		}
		
		
		try {
			List<Service> services = ServiceDAO.getInstance().getAllServicesToUser(u8.getId());
			List<Evaluate> evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u8.getId());
			Assert.assertFalse(services.isEmpty());
			Assert.assertFalse(evaluates.isEmpty());
			
			userDAO.remove(u8.getId());//usuário com ambos
			Assert.assertFalse(userDAO.findUserBy(u8.getId()) == null);
			
			services = ServiceDAO.getInstance().getAllServicesToUser(u8.getId());
			evaluates = EvaluateDAO.getInstance().getAllEvaluatesTo(u8.getId());
			Assert.assertTrue(services.isEmpty());
			Assert.assertTrue(evaluates.isEmpty());
			
		} catch (UserTransactionException e) {
			Assert.fail("Não deveria ter lançado exceção");
		}
		
	}
	
	public void testaSeUsuarioEhAtualizadoComParametrosInvalidos(){
		u5.setPhone("(83) 81887070");
		try {
			UserDAO.getInstance().update(u5);
		} catch (UserTransactionException e) {
			Assert.fail("Não deveria ter lançado exceção");
		}
	}
	
	private City getCampinaGrandeCity(){
		return LocationDAO.getInstance().getCity((long)2610);
	}
	private City getAmparoCity(){
		return LocationDAO.getInstance().getCity((long)2569);
	}
	private City getBaiaDaTraicaoCity(){
		return LocationDAO.getInstance().getCity((long)2579);
	}
	private City getJoaoPessoaCity(){
		return LocationDAO.getInstance().getCity((long)2655);
	}
}
