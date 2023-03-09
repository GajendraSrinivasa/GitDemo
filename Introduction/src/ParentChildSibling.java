import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildSibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");  // access to browser
		WebDriver driver = new ChromeDriver();  // takes to browser
		
		driver.get("https:\\rahulshettyacademy.com/AutomationPractice/"); 
		
		//driver.findElement(By.xpath("//header/div/button[1]")).click();  // it will take to practice page. Parent to Child
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();  //parent to child to sibling.
		
		
		
		
	}

}
