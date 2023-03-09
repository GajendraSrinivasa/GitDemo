package Tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestComponents.BaseClass;
import pageObjects.CartPage;
import pageObjects.ProductCatalogue;

public class Test1 extends BaseClass {

	@Test()
	public void LoginErrorValidation() throws IOException, InterruptedException {

	
		landingPage.loginApplication("hans@gmail.con", "Stent@1234");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());

	}
	

	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException
	{

		String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue = landingPage.loginApplication("hans@gmail.con", "Student@1234");
		//List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
		
	

	}

	
}
