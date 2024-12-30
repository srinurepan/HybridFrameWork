package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;
import utilities.DataProviders;
//data is valid --- login success ->test pass -logout
//data is valid  --- login failed -> test fail

//data is invalid---login success -> test fail --logout
//data is invalid---login failed  -> test pass

public class TC003__DDTTest extends BaseClass {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class) //getting data from different package	
	public void loginDemo(String email,String pwd,String exp) {
	
		logger.info("** testcase started");
		try {
		HomePage hm=new HomePage(driver);	
		hm.btnmyACC();
		hm.clickLogin();
	
	LoginPage lp=new LoginPage(driver);
	lp.setMail(email);
	lp.setPassword(pwd);
	lp.btnclick();
	
	MyAccount mac=new MyAccount(driver);
	boolean conformation = mac.validation();
	
	if(exp.equalsIgnoreCase("valid")) {
		if(conformation==true) {
			
			mac.clickLogout();
			Assert.assertTrue(true);
			
		}
		
		else {
			
			Assert.assertTrue(false);
			
			
		}
		
	}

	 
	if(exp.equalsIgnoreCase("invalid")) {
		
		if(conformation==true) {
			
			mac.clickLogout();
			Assert.assertTrue(false);
			
		}
		else {
			
			Assert.assertTrue(true);
			
			
		}
	}


	}  // here try end
		catch(Exception e) {
		
		Assert.fail();
	}
	
		logger.info("** testcase finished");
	}
	
}
