import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators_continue1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe"); // access to browser
		WebDriver driver = new ChromeDriver(); // takes to browser

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // written because of line 25
		String name = "gajen";

		driver.get("https:\\rahulshettyacademy.com/locatorspractice/"); // takes to website

		String Password = ExtractPassword(driver); // takes to method down and extracts password.

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); // go to login

		Thread.sleep(2000); // wait for page transition
		driver.findElement(By.id("inputUsername")).sendKeys(name); // enter username, stored already in string
		driver.findElement(By.name("inputPassword")).sendKeys(Password); // enter password, extracted already
		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000); // if u don't put this, next line wont be executed. // wait for new page
		System.out.println(driver.findElement(By.tagName("p")).getText()); // gives u r successfully logged in
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); // to
																												// check
																												// wt is
																												// actual
																												// and
																												// expected
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ","); // checking whether its greeting with the name gajen after login

		// driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button[text()='Log Out']")).click(); // Logout button
		driver.close(); // closes the browser.

	}

	public static String ExtractPassword(WebDriver driver) throws InterruptedException {

		driver.findElement(By.linkText("Forgot your password?")).click(); // directly clicking forgot password, as we
																			// don't know username and password
		Thread.sleep(2000); // time for page transition
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // it gives temporary password if we click
																		// directly sign in button,
		String ArrayPassword = driver.findElement(By.cssSelector("form p")).getText(); // copies whole text as string
		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] Password1 = ArrayPassword.split("'"); // splits the string by "'" and stored to array Password1
		// Password1[0] = Please use temporary password Password1[1]=rahulshettyacademy'
		// to Login.
		String[] Password2 = Password1[1].split("'"); // wt we need is 2nd element of array that is Password[1], and
														// that is also splitted by "'" .
		String ReqPassword = Password2[0]; // first element of of array that is Password2[0] is wt we required, that is
											// stored in String ReqPassord
		// String Password = Password1[1].split("'")[0] // u can write this directly
		// instead of above 2 lines

		return ReqPassword; // return wt we need to main method

	}

}
