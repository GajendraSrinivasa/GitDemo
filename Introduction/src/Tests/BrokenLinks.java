package Tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	// getting the url of the link	
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
	// java openConnection method of class URL, to get connect to that url.
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		// HttpURLConnection is return type for the object conn, which is casted to class URL. And .openConnection is a method in URL class
		conn.setRequestMethod("HEAD");
		conn.connect();
		
	// get the response code of that url 
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		
	}

}
