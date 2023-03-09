import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// create a list items u want to add to cart
		String[] myCart = {"Brocolli", "Beetroot", "Capsicum", "Banana"};
		// convert array into arrayList. Array is used because it takes less space than arrayList. During run time, array is converted to arrayList
		List<String> myCartList = Arrays.asList(myCart);
		int count =0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000); // it takes some time to load items 
		// There are 30 elements with product-name as value for class attribute. all product names now are taken into list. each item is a webelement
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<items.size(); i++)  // iterating each item
		{
			String[] itemName = items.get(i).getText().split("-"); // get text of the each i  and split the product-name
			String myItemName = itemName[0].trim();  // to trim the whit space
			
			if(myCartList.contains(myItemName))  // checking condition if the item name running in the for loop matches with items in the arrayList.
			{
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); //dont depend on text, in this case, beacuse once u clicked
				// on add to cart, it is changing to added for few seconds, by that time, loop runs several times and picks wrong items.
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click(); //adds to cart if it matches

				count++;
				
				//if(count==myCartList.size())  
				if(count==myCart.length)   // i.e, .size() for arrayList and .length for array.
				{
					break;
				}
			}
		}

	}

}
