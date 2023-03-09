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

	public class standAloneTestModified {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String MyProduct = "ADIDAS ORIGINAL";
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			LandingPage landingPage = new LandingPage(driver);
			landingPage.GoTo();
			landingPage.loginToApplication("simple@gmail.com", "Abc@123456");
			
			ProductCatalouge prdtCatalog = new ProductCatalouge(driver);
			List<WebElement> products =  prdtCatalog.getProductList();
			prdtCatalog.addProductToCart(MyProduct);
			
			cartPage cart = new cartPage(driver);
			List<WebElement> cartProducts = cart.getCartList();
			cart.ItemsInCart(MyProduct);
			
			
			Actions a = new Actions(driver);
			a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

			driver.findElement(By.xpath("(//button[contains(@class,'ta-item')][2]")).click();
			driver.findElement(By.cssSelector(".action__submit")).click();

			String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
			Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
			
			

			
		}

	}


