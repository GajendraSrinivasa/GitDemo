package RoyalChallengers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class standAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String MyProduct = "ADIDAS ORIGINAL";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	// wait for browser to load and login
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("simple@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Abc@123456");
		driver.findElement(By.id("login")).click();
		
	// wait for products to load and select a product and click to add to cart
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".col-lg-4"))); //explicit wait to load products
		
		List<WebElement> products = driver.findElements(By.cssSelector(".col-lg-4"));
		
		WebElement prod =  products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(MyProduct)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
	// wait for messages and click on cart button to open the cart window.
		// after clicking the add to cart button, its taking some time to load and shows the message added to cart and disappears. 
		//The ID's or classnames are difficult to find in html code, so this can be taken from developer. 
		// for showing message, ID is "toast-container"
		// for disappearing message, the class name is "ng-animating"
		//have to explicitly wait until the message shows and disappears, before clicking on cart button, else fails to click cart button
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));// this code takes more time 
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		
		driver.findElement(By.cssSelector("[routerlink= '/dashboard/cart']")).click();
		
	// check the item in the cart is the same one which we added and checkout
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));  // take the all cart products to list 
		
		Boolean match  = cartProducts.stream().anyMatch(cartProduct->
		cartProduct.getText().equalsIgnoreCase(MyProduct));  // match the product using anymatch method, store as boolean value
		
		Assert.assertTrue(match); // if the product is matched, the value of match will be true, so assertTrue(True) is True, test passes
		
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
	// select country in payment page and click place order and check the confirmation message.
		
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')][2]")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();

		String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
		
/*		
// my tries
		driver.findElement(By.cssSelector("[placeholder='Select Country']")).sendKeys("ind");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		
		List<WebElement> options = driver.findElements(By.cssSelector(".fa-search"));
		for (WebElement option : options) {
			if ("India".equals(option.getText())) {
				option.click();
				break;
			}
		}
		//options.stream().filter(option-> option.getText().equals("India"));*/
		
	}

}
