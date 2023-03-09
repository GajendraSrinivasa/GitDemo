package RoyalChallengers;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class cartPage {
WebDriver driver;
	
	public cartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= ".cartSection h3")
	List<WebElement> cartProducts;
	
	@FindBy(css= ".totalRow button")
	WebElement checkout;

	public List<WebElement> getCartList() {
		return cartProducts;
	}
	public void ItemsInCart(String MyProduct) {
		Boolean match  = cartProducts.stream().anyMatch(cartProduct->
		cartProduct.getText().equalsIgnoreCase(MyProduct)); 
		Assert.assertTrue(match);
		
		checkout.click();
		
	}
}
