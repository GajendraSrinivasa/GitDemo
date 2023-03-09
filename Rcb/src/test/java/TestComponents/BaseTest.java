package TestComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() {
	
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
	return driver;
	}
	@BeforeMethod(alwaysRun = true)
	public void launchApplication() {
		
		driver = initializeDriver();
		
		
	}

}
