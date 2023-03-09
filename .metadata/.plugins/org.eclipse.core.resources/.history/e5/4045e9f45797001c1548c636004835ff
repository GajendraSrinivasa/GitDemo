package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Scrolling through Java Script
		JavascriptExecutor js = (JavascriptExecutor)driver;  //Casting driver to java script executor
		js.executeScript("window.scrollBy(0,500)");   //Scrolling the window by coordinates
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); // scrolling the component in a page
		
		//querySelector is similar to cssSelecotor. tableFixHead is the value of the class. document is similar to driver.findeElement(By.
		
		int sum=0;
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		for(int i=0; i<values.size(); i++)
		{
			int value = Integer.parseInt(values.get(i).getText());
			sum = sum + value;
		}
		System.out.println(sum);
		
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
		
	}

}
