import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackForward {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe"); // access to browser
		WebDriver driver = new ChromeDriver(); // takes to browser

		driver.get("http:\\google.com");
		driver.navigate().to("http:\\rahulshettyacademy.com");
		Thread.sleep(2000); // intentionally kept. just to make it wait
		driver.navigate().back();
		Thread.sleep(2000); // intentionally kept. just to make it wait
		driver.navigate().forward();
	}

}
