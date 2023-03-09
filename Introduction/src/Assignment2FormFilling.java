import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Assignment2FormFilling {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Gajendra");
		driver.findElement(By.name("email")).sendKeys("indra123@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("gaja@1234");
		driver.findElement(By.id("exampleCheck1")).click();
		
		/*WebElement StaticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByVisibleText("Male");*/
		
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[1]")).click();  // can write code in xpath for dropdowns

		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("11051998");
		
		driver.findElement(By.cssSelector(".btn")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert")).getText());
		/* This is the output it is producing
		�
		Success! The Form has been submitted successfully!. */
		
		//Assert.assertEquals(driver.findElement(By.cssSelector(".alert")).getText(), "Success! The Form has been submitted successfully!.");
		// the previous line of code is giving error, because the 'x' mark isn't present in the expected value.
		

	}

}
