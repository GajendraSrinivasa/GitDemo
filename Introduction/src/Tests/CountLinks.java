package Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	// 1 total links in the page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
	// 2 total links in the footer section of the page 
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(	footer.findElements(By.tagName("a")).size());
		
	// 3 total links in the first column of the footer section of the page.
		WebElement column = footer.findElement(By.xpath("//td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());   // 5 links
		
	// 4 click on each link of the first column and check whether they are working
		for(int i=1; i<column.findElements(By.tagName("a")).size(); i++)   // we r excluding 0th link, as it opens same page back
		{
			String ClickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);  // control+click on the link will open the link in new tab.
			column.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLink);  //4 windows opened 
			Thread.sleep(3000L);  // takes few seconds to load the windows
		}
		
	// 5 get the titles of all the windows opened. (there are 5 windows. 1 parent window and 4 child widows.)
		Set<String> windows =  driver.getWindowHandles();  // ID's of each window are stored in object windows
		Iterator<String> it = windows.iterator(); // it iterates [0, 1, 2, 3, 4]
		
		while(it.hasNext())  // checks whether there is next window 
		{
			driver.switchTo().window(it.next()); // driver goes to 0th index window first time, then 1st window and goes on till 4.
		// during each run the driver will be in different window and it.next() takes to next window and prints the title of the page.	
			System.out.println(driver.getTitle());
		}
		
		
		

	}

}
