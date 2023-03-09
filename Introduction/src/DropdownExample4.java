// Flight booking- auto suggest based on wt u type.


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownExample4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");  // access to browser
		WebDriver driver = new ChromeDriver();  // takes to browser
		driver.get("https:\\rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("can");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));    // List is a built in class 
		
		for(WebElement option: options)   // return type is webelement 
		{
			//if(option.getText().equalsIgnoreCase("Canada"))  // rahul way
			if("Canada".equals(option.getText()))	// found in google
			{
				option.click();
				break;
			}
		}
		
		
	}

}
