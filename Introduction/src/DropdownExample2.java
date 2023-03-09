// flight booking, selecting passengers using dropdown


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");  // access to browser
		WebDriver driver = new ChromeDriver();  // takes to browser
		driver.get("https:\\rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000); // to avoid Synchronization Error. it might take a second to dropdown.
		// test for selecting 4 passengers
		// use while or for loop to click and select 3 additional adults to make it 4, one will be already selected by default
		
		int i=1; 	//initialize
		while(i<5)   // condition   // true for i=1,2,3,4. i,e 4 clicks. total adults selected is 5.
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		Thread.sleep(2000); //intentionally kept.
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
