package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class HomePage extends BasePage {

	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

//locators
	
@FindBy(xpath="//span[@class='caret']")
WebElement myAccount;
@FindBy(xpath="//a[normalize-space()='Register']")
WebElement register;

//login locator
@FindBy(xpath="//a[normalize-space()='Login']") 
WebElement login;
//methods

public void btnmyACC() {
	myAccount.click();
}


public void btnregister() {
	register.click();
}

public void clickLogin() {
	login.click();
	}
}
