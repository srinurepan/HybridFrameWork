package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pageObjects.HomePage;
import pageObjects.Register;
import testBase.BaseClass;



public class TC001_AcountRegistration extends BaseClass {

//	WebDriver driver;		

	
	@Test(groups={"sanity","master"})
	public void test(){
	
		try {
	   //	call homepage
		
		logger.info("click homepage button");
		
	HomePage hm=new HomePage(driver);	
	hm.btnmyACC();
	hm.btnregister();
	
	//call RegisterPage
	logger.info("click Register button");
	
	Register rg=new Register(driver);	
	
	rg.setName(randomString());
	rg.setLastName(randomString());
	rg.setmail(randomString()+"@gmail.com");//generated randomly
	rg.setphone(randomNumberic());
	

	
	String password = randomNumberic();//randomly genrated 
	
	rg.setpassword(password );
	rg.setConfirmPassword(password );
	rg.setagree();
	rg.clickContinue();
	
	logger.info("validation of registration");
	
	String confirmMSG = rg.getConfirmationMsg();
	
	if(confirmMSG.equals("Your Account Has Been Created!")) {
	Assert.assertTrue(true);
	//Assert.assertEquals(confirmMSG,"Your Account Has Been Created!");
	
		}
	else {
		
		logger.error("test failed");
		logger.debug("debug logs");
		Assert.assertTrue(false);
	}
		}
	catch(Exception e) {
	
	Assert.fail();
	}
	}
	
	public String randomString() {
		String generatedString =RandomStringUtils.randomAlphanumeric(6) ;
	return generatedString;
	}


	public String randomNumberic() {
		String generatedNumber = RandomStringUtils.randomNumeric(6);
	return generatedNumber;
	
	}
	public String RandomAlphaNumberic() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		
		String generatedNumber = RandomStringUtils.randomNumeric(4);
	
		return(generatedString+"@"+generatedNumber);
	
	
	}

}
