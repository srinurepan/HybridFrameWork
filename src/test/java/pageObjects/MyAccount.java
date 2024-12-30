package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class MyAccount extends BasePage {

	public MyAccount(WebDriver driver) {
		super(driver);
		
	}
		
	@FindBy(xpath="//h2[normalize-space()='My Account']") 
	WebElement myAccount;
		
	//logout locator
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") 
	WebElement logout;
	public boolean validation() {
		try {
	    return	myAccount.isDisplayed();
	       }
	
		catch(Exception e){
		
	return	false;
	}
	
	}


	public void clickLogout() {
		
		logout.click();
	}

}
