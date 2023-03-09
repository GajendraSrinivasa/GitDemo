import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropdownExample5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");  // access to browser
		WebDriver driver = new ChromeDriver();  // takes to browser
		driver.get("https:\\rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).click();  // selecting the checkbox
		//System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected());  // this gives true in output
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected()); // if the condition returns false, code fails
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).click();  // selecting the checkbox
		//System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected()); // this gives false in output
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
