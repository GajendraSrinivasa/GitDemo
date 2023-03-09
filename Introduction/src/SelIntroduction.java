import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gajendra\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\gajendra\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new EdgeDriver();
		driver.get("https:\\rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
