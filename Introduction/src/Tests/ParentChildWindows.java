package Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");  // access to browser
		WebDriver driver = new ChromeDriver();  // takes to browser
		driver.get("https://rahulshettyacademy.com/loginpagePractise/"); // First window
		driver.findElement(By.cssSelector(".blinkingText")).click();// second window
		
	// driver object cannot do anything with second window. If the driver object want to access something from second window, 
	// it has to switch from first window to second window. For that we need ID's of both the windows.
		
		Set<String> windows = driver.getWindowHandles();//Gets the ID's of all opened windows n stores in the object 'windows'.[First window, second window]
		
	// if u want to the id of the second window. create object of the class iterator and use the object to iterate the ID's of the windows
		Iterator<String> it =  windows.iterator(); // created the object, of the class iterator. now the object iterates the ID's of both the windows
		
		String parentId = it.next(); // the first time .next() goes to 0th index window that is first window
		String childId = it.next();  // the next, .next() goes to 1st index window that is second window
		
	// now u have the ID of the second window stored in the string variable childId. 
		driver.switchTo().window(childId); // now the driver has switched to the child window that is second window.
		
		
	// take the message u want by splitting the whole line
		//String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];  // splitted and and took 4th index text.   
		
	// the message which was in 2nd window is stored in the variable emailId, now it has to be pasted in the in the space of username in the first window.
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
	}

}
