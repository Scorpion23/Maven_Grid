package rsa_Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import rsa_PageObjects.DashboardPage;
import testComponents.BaseTest;



@Listeners(testComponents.Listeners.class)

public class ErrorValidationsTest extends BaseTest {

	
	String email = "dhoni@yopmail.com";
	String password = "Sachin@123";
	String product ="adidas";

//	@Test(successPercentage = 60,invocationCount = 1)
	@Test
	public void correctlogin() throws IOException {

		DashboardPage dashboard = loginpage.getloginpage(email, password);
		dashboard.waituntillpageload();
		String loginmsg = dashboard.loginassert();
		Boolean log = loginmsg.toLowerCase().contains("success");
		Assert.assertTrue(log);
		
		System.out.println("Login Success passed");
		
		

	}
	
	
	

	


	
	



	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
