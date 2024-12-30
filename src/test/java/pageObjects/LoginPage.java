package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.BasePage;

public class LoginPage extends BasePage {

	
	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	//login locators
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement MailAddress;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	
	
	
//action methods
	
	public void setMail(String mail) {
		
		MailAddress.sendKeys(mail);
	}
public void setPassword(String pw) {
	password.sendKeys(pw);
}

public void btnclick() {
	login.click();
}


}
