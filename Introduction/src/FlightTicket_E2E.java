import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlightTicket_E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https:\\rahulshettyacademy.com/dropdownsPractise/");

		// Auto Suggest, selecting country
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if ("India".equals(option.getText())) {
				option.click();
				break;
			}
		}

		// departure and arrivals
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA']) [2]")).click();
		Thread.sleep(2000);

		// since chosen oneway, select date and check whether return date is blocked
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// selecting 5 adults
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 1;
		while (i < 5) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			i++;
		}

		// static dropdown, selecting currency type using the class Select. The direct
		// selection of currency without using class is also given
		WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(3);
		// driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option
		// [4]")).click();

		// selecting the checkbox,
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		// click for search
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
