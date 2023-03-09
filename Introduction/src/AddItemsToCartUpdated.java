import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemsToCartUpdated {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver,5); // explicit wait
		
		String[] myCart = {"Brocolli", "Beetroot", "Capsicum", "Banana"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/"); 
		Thread.sleep(2000);
		addItems(driver, myCart);
		//AddItemsToCartUpdated c = new AddItemsToCartUpdated(); // creating the object of the class to access the method of that class.
		//c.addItems(driver, myCart); //This two lines are used if we don't want a static method. 
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));  // only for explicit wait
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']"))); 
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		
	}
	
	public static void addItems(WebDriver driver,String[] myCart){
		int count =0;
		List<String> myCartList = Arrays.asList(myCart);
		
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<items.size(); i++)  // iterating each item
		{
			String[] itemName = items.get(i).getText().split("-"); 
			String myItemName = itemName[0].trim();  
			
			if(myCartList.contains(myItemName))  
			{
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				count++;
				
				//if(count==myCartList.size())  
				if(count==myCart.length)   
				{
					break;
				}
			}
		}
	}
}
