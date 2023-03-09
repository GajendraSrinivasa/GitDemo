package RoyalChallengers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponenet {
	WebDriver driver;

	public AbstractComponenet(WebDriver driver) {
		this.driver = driver;
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	public void WaitForElementTOAppear(By findBy) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(findBy));// it was By.cssSelector(), that's why By
	}
	
	public void WaitForElementToDisappear(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element)); // it was Driver.findElement(By.cssSelector()), that's why webElement
	}


}