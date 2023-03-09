package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  // these 2 lines not required
		js.executeScript("window.scrollBy(0,650)");
		
		List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(rows.size());
		
		List<WebElement> columns = driver.findElements(By.cssSelector(".table-display tr th"));
		System.out.println(columns.size());
		
		List<WebElement> row2Data = rows.get(2).findElements(By.cssSelector(".table-display tr td"));
		System.out.println(row2Data.get(0).getText());
		System.out.println(row2Data.get(1).getText());
		System.out.println(row2Data.get(2).getText());

	}

}
				// Rahul Solution
/*
		WebElement table = driver.findElement(By.id("product"));

		System.out.println(table.findElements(By.tagName("tr")).size());

		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());

		System.out.println(secondrow.get(1).getText());

		System.out.println(secondrow.get(2).getText());

	}

}
*/