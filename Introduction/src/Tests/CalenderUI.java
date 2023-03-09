// selecting date in flight ticket booking. Negation is used in while loop. Very important concept


package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		
		// select the month of the calendar in flight ticket booking
		WebElement month = driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch"));
		while(!month.getText().contains("June 2023")) // negation of false is true.
		{
			driver.findElement(By.cssSelector(".datepicker-days .next")).click();
		}
		
/*
		// 2nd way to select the month. in this way u cant select the year. write separate code fpr year also
	    driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).click();
		List<WebElement> monthList = driver.findElements(By.className("month"));
		
		for(int i=0; i<monthList.size(); i++)
		{
			String monthSelected = monthList.get(i).getText();
			if(monthSelected.equalsIgnoreCase("May"))
			{
				monthList.get(i).click();
				break;
			}
		}
*/
	
		
		
		// Select the date in the selected month
		//List<WebElement> dates = driver.findElements(By.className("day")); // size of this is 42
		List<WebElement> dates = driver.findElements(By.cssSelector("td[class='day']"));  // size of this is 30
		
		/*Month of june has 30 days.But therre will be some old days( days of previous month) and new days(days of next month) visible 
		These days will have low opacity. if u use the first the first one, and if u wanna select june 30, it will selct may 30.
		because u can see 30 at two places and which ever comes first that will be selected. becuase if u use classname locator, it
		counts old day, day and new day as day, as it sees day in all 3. if u use standard css Selector syntax, it looks only foe day.
		*/
		
		System.out.println(dates.size());
		
		for(int i=0; i<dates.size(); i++)
		{
			String text = dates.get(i).getText();
			
			if(text.equalsIgnoreCase("30"))
			{
				dates.get(i).click();
				break;
			}
		}

	}

}
