package RoyalChallengers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalouge extends AbstractComponenet{
	WebDriver driver;
	
	public ProductCatalouge(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css= ".col-lg-4")
	List<WebElement> products;
	
	By prdts = By.cssSelector(".col-lg-4");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");
	WebElement disappear = driver.findElement(By.cssSelector(".ng-animating"));
	
	// Get the list of products
	public List<WebElement> getProductList() {
		WaitForElementTOAppear(prdts);  // here findBy is prdts, and this method is in the AbstarctComponent class
		return products;
	}
	
	// scan the product and add to cart
	public void addProductToCart(String MyProduct) {
		WebElement prod =  products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(MyProduct)).findFirst().orElse(null);
		prod.findElement(addToCart).click();
		
		WaitForElementTOAppear(toastMessage); 
		WaitForElementToDisappear(disappear);

	}
	
}
