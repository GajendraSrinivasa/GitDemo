package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");  // access to browser
		WebDriver driver = new ChromeDriver();  // takes to browser
		driver.get("https:\\amazon.com");
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).contextClick().build().perform();
		Thread.sleep((3000));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("pen").doubleClick().build().perform();
			// u may enter as-- pen, PEN, Pen,PEn, pEN and so on. the value u see in the website is PEN. 
	}

}
