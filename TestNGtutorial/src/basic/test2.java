package basic;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	
	@Test
	public void me() {
		System.out.println("123");
	}
	
	@BeforeTest
	public void prerequisite() {
		
		System.out.println("i ll execute first");
	}
	
	@Test(groups = {"Gaja"})
	public void sheLog() {
		System.out.println("456");
	}

	@Test
	public void sheSign() {
		System.out.println("426");
	}

	@Test(groups = {"Gaja"})
	public void sheOut() {
		System.out.println("223");
	}

}
