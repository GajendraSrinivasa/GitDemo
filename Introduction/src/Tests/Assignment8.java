package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("uk");
		Thread.sleep(2000);
		
/*		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li/div[text() = 'United Kingdom (UK)']"))).click().build().perform();
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		// getattribute("value") is the simple way to grab the text in the edit boxes
*/		
		
		 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);  //selecting the country in autosuggest by using down arrow key.
		 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		 System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

		       
		
		
		
		/*Thread.sleep(2000);
		List<WebElement> suggestedCountries = driver.findElements(By.cssSelector(".ui-menu-item"));
		
		for(int i=0; i<suggestedCountries.size();i++)
		{
			String country = suggestedCountries.get(i).getText();
			if(country.contains("United Kingdom"))
			{
				suggestedCountries.get(i).click();
				break;
			}
		}*/
		
		
		
		
		/*for(WebElement country:suggestedCountries)   // return type is webelement 
		{
			//if(option.getText().equalsIgnoreCase("Canada"))  
			if("United Kingdom (UK)".equals(country.getText()))	
			{
				country.click();
				break;
			}
		}*/
	}

}
