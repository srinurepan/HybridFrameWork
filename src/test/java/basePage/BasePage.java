package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;	
	
	//constructor(this common for all page object clses
	
 public	BasePage(WebDriver driver){
		
		this.driver=driver;		
	PageFactory.initElements( driver,this);
	
	}
	
}
