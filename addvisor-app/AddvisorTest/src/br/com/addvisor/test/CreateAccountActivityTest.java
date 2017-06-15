package br.com.addvisor.test;

import com.robotium.solo.Solo;

import br.com.addvisor.activities.CreateAccountActivity;
import br.com.addvisor.activities.MainActivity;
import android.test.ActivityInstrumentationTestCase2;

public class CreateAccountActivityTest extends ActivityInstrumentationTestCase2<CreateAccountActivity> {

	private Solo solo;
	
	public CreateAccountActivityTest() {
		super(CreateAccountActivity.class);	
	}
	
	
	 public void setUp() throws Exception {
		    solo = new Solo(getInstrumentation(), getActivity());
	 }

	 public void test_passwd_does_not_match(){
		 solo.enterText(0, "any name");
		 solo.enterText(1, "anyemail@email.com");
		 solo.enterText(2, "83 99999999");
		 solo.enterText(3, "123");
		 solo.enterText(4, "321");
		 solo.clickOnImageButton(0);
		 assertFalse(solo.searchButton("Password not equals"));
		 

	 }
	  
	 public void test_emptyFields(){
		 
		 
		 solo.enterText(0, "any name");
		 solo.enterText(1, "anyemail@email.com");
		 solo.enterText(2, "83 99999999");
		 
		 
		 solo.clickOnImageButton(0);
		 boolean actual = solo.waitForText("Senha");
		 assertEquals("Fill out all fields",true, actual);
		 
	 }
	 
	 public void test_invalid_email(){
		 solo.enterText(0, "any name");
		 solo.enterText(1, "anyemail@email");
		 solo.enterText(2, "83 99999999");
		 solo.enterText(3, "123");
		 solo.enterText(4, "123");
		 solo.clickOnImageButton(0);
		 assertFalse(solo.searchButton("invalid email"));
		 

	 }
	 
		  @Override
	public void tearDown() throws Exception {
		    solo.finishOpenedActivities();
	}
} 