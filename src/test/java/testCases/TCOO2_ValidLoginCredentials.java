package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TCOO2_ValidLoginCredentials extends BaseClass {

	@Test(groups={"Regression","master"})	
	public void validLogin() {
		
		logger.info("**** test started ****");
		try {
		HomePage hm1=new HomePage(driver);	
	
	       hm1.btnmyACC();
	      hm1.clickLogin();
	
	       LoginPage lp=new LoginPage(driver);
	
	       lp.setMail("abc123@gmail.com");
	       lp.setPassword("test@123");
	       lp.btnclick();

	MyAccount myac=new MyAccount(driver);
	
	boolean conformation = myac.validation();
	
	Assert.assertTrue(conformation);
	   //or
	Assert.assertEquals(conformation, true);
	
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		
		logger.info("**** test finished ****");
	}
	
	
}
