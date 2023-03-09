package TestComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPage;

public class BaseClass {
	
	public WebDriver driver;
	public LandingPage landingPage;
	
	public WebDriver initializeDriver() {
	
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
	return driver;
	}
	@BeforeMethod(alwaysRun = true)
	public LandingPage launchApplication() {
		
		driver = initializeDriver();
		landingPage = new LandingPage(driver);
		landingPage.goTO();
		return landingPage;
		
	}
}
