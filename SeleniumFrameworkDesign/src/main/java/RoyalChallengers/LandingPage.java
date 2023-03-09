package RoyalChallengers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponenet {

		WebDriver driver; // create a local webelement driver
		
// create a constructor to access the driver from the standAloneTest 
		public LandingPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);// to initialize all the elements
		}
		
		@FindBy(id= "userEmail")
		WebElement Email;
		
		@FindBy(id= "userPassword")
		WebElement Pswd;
		
		@FindBy(id= "login")
		WebElement Submit;
		
		public void GoTo() {
			
			driver.get("https://rahulshettyacademy.com/client");
		}
		
		public void loginToApplication(String email, String password) {
			
			Email.sendKeys(email);
			Pswd.sendKeys(password);
			Submit.click();
		}
		
		
		
		
}


