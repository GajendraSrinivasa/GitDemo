package basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test4 {
	
	@Test
	public void webhomeloan() {
		System.out.println("webhome Selenium");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("i ll execte before every method of this class");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("i ll execte after every method of this class");
	}
	
	@Test
	public void mobilehomeloan() {
		System.out.println("mobilehome appium");
	}
	
	@Test(groups = {"Gaja"})
	public void Apihomeloan() {
		System.out.println("Apihome Rest Api");
	}

}
