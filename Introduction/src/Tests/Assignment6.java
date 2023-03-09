package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String text = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(text);
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
	
		//Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Option3, share this practice page and share your knowledge");
			
		// Rahul way
		
		String pop = driver.switchTo().alert().getText();
		if(pop.contains(text))
		{
			System.out.println("Alert message successfull");
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Alert message not successfull");

		}
	}

}
