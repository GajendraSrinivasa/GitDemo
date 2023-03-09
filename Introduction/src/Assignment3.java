import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
		driver.findElement(By.cssSelector("#okayBtn")).click();
		
		WebElement s = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select d= new Select(s);
		d.selectByVisibleText("Consultant");
		//driver.findElement(By.cssSelector("option[value='consult']")).click();
		
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-link")));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));  // use of partial link text
		
		List<WebElement> products = driver.findElements(By.cssSelector(".btn-info"));
		
		for(int i=0; i<products.size(); i++)
		{
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		//driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		
	}
	

}
