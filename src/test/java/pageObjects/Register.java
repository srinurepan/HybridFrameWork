package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class Register extends BasePage{

	WebDriver driver;
	   //constructor
	
	public Register(WebDriver driver) {
		super(driver);
		
	}
 
	            //locators
	

@FindBy(xpath="//input[@id='input-firstname']")
WebElement firstName;
@FindBy(xpath="//input[@id='input-lastname']") 
WebElement lastName;
@FindBy(xpath="//input[@id='input-email']")  
WebElement eMail;
@FindBy(xpath="//input[@id='input-telephone']") 
WebElement telephone;
@FindBy(xpath="//input[@id='input-password']") 
WebElement password;
@FindBy(xpath="//input[@id='input-confirm']")  
WebElement passwordConfirm;
@FindBy(xpath="//input[@name='agree']")  
WebElement agree;
@FindBy(xpath="//input[@value='Continue']") 	
WebElement continuebtn;


//conformation msg
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") 
WebElement yourAccountHasBeenCreated;

public void setName(String name) {
	firstName.sendKeys(name);
	
}

public void setLastName(String lastname) {
	lastName.sendKeys(lastname);
	
}
public void setmail(String email) {
	eMail.sendKeys(email);
	
}
public void setphone(String number) {
	telephone.sendKeys(number);
	
}
public void setpassword(String pw) {
	password.sendKeys(pw);
	
}
public void setConfirmPassword(String pw) {
	passwordConfirm.sendKeys(pw);
	
}

public void setagree() {
	agree.click();
	
}
public void clickContinue() {
	continuebtn.click();
	
}


public String getConfirmationMsg() {
	
	try {
		return(yourAccountHasBeenCreated.getText());
	}
	catch(Exception e) {
		
	return	(e.getMessage());
	
		
	}
	

}
}
