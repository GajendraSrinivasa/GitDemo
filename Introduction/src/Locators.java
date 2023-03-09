import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");  // access to browser
		WebDriver driver = new ChromeDriver();  // takes to browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   // written because of line 25
		
		driver.get("https:\\rahulshettyacademy.com/locatorspractice/");    // takes to website
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");     // enter username
		driver.findElement(By.name("inputPassword")).sendKeys("gaja1998");	// enter password
		
		//Thread.sleep(5000);
		driver.findElement(By.className("signInBtn")).click();   // click signin button
		//driver.findElement(By.className("submit")).click();  // there were two class names, u can use one
		
		//System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText())    // you can use this syntax also. x path syntax can also be used here.
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());  //If line 14 isn't there, within millisecs after .click() it will execute this line. 
														//But, by that time incorrect password message wont be there on the login page. so it cant find p.error in the code.
		
		driver.findElement(By.linkText("Forgot your password?")).click();  // click on forgot password
		
		// All possible syntaxes is used below, use the syntax as in line 33,40,42 and 47 because the attributes are unique. use syntax as per lines 34,41, and 46 if no unique 
		//attributes, use as per line 48 even wn matching attributes are also not available. line 35 and 43 aren't valid, explaination given.
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");   // enter name
		//driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("John");  
		//driver.findElement(By.xpath("//form/input[1]")).sendKeys("John");  // this line wont be valid because name and username can be same, 2 elements matching 

		//since their are 4 elements matching wn checked for uniqeness, 
		//index number is given as per the xpath number(visible wn checked for uniqueness in the selectorsHub) in the line of code. Explanation for line 34
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john1234@yahoo.com"); //you can use cssSelector also for this 3 lines. // enter email
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john1234@gmail.com");
		//driver.findElement(By.xpath("//form/input[2]")).sendKeys("John1234@gmail.com"); // this line wont be valid because Email and username can be same, 2 elements matching 
		
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234567890");  // enter phone number
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0987654321");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();  // click on reset button
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());   // website gives temporary password
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();   // click on go to login
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");   // enter username 
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");   // enter the temporary password given by website
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for=chkboxOne]")).click();   // click on remember username checkbox
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();   // click on signin button
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div button")).click();  // this time website opens, click on logout button
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[id='visitUsTwo']")).click();  // after logout it comes back to sign in page, click on visit us, it takes to new window.

	}

}
