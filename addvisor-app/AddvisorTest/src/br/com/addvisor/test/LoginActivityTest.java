package br.com.addvisor.test;

import com.robotium.solo.Solo;

import br.com.addvisor.activities.CreateAccountActivity;
import br.com.addvisor.activities.LoginActivity;
import android.test.ActivityInstrumentationTestCase2;

public class LoginActivityTest extends ActivityInstrumentationTestCase2<LoginActivity> {

	private Solo solo;
	
	public LoginActivityTest() {
		super(LoginActivity.class);	
	}
	
	
	 public void setUp() throws Exception {
		    solo = new Solo(getInstrumentation(), getActivity());
	 }

	 public void test_clickOnSingUp (){
		 
		 solo.clickOnImageButton(1);
		 assertTrue(solo.waitForActivity(CreateAccountActivity.class));
		 
	 }
	
	 public void test_emptyPhone () {
		 solo.clickOnImageButton(0);
		 boolean actual = solo.waitForText("Telefone");
		 assertEquals("Fill out all fields",true, actual);
	 }
	 
	 public void test_emptyPass () {
		 solo.clickOnImageButton(0);
		 boolean actual = solo.waitForText("Senha");
		 assertEquals("Fill out all fields",true, actual);
	 }
	 
    @Override
	public void tearDown() throws Exception {
		    solo.finishOpenedActivities();
	}
} 


