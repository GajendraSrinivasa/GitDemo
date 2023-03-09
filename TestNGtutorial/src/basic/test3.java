package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test3 {
	
	@Test
	public void webcarloan() {
		System.out.println("webcar Selenium");
	}

	@Test(groups = {"Gaja"})
	public void mobilecarloan() {
		System.out.println("mobilecar appium");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("i ll execte after this class");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("i ll execte before this class");
	}
	
	@Test
	public void Apicarloan() {
		System.out.println("Apicar Rest Api");
	}
}
