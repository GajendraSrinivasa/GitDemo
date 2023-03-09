//Flight booking selecting the departure and arrival locations and dates


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropdownExapmle3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");  // access to browser
		WebDriver driver = new ChromeDriver();  // takes to browser
		driver.get("https:\\rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  // if u dont want ot use index
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		// to check whether the return date is activating or not when clicked on roundtrip. 
		
		/*driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();  // selected round trip
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("round trip");
			Assert.assertTrue(true);
		}
		else  // if it enters else statement, code should fail, b/c we selected roundtrip, and therefore opacity should be one, if not there is error
		{
			System.out.println("one-way");
			Assert.assertTrue(false);  //here it fails
		}
		*/
		
		
		// to check wether the return date is deactivated or not wn clicked one-way
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("oneway");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("roundtrip");
			Assert.assertTrue(false);  //here it fails
		}
		
	}

}
