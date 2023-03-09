package basic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test1 {

	/*   U dont need this main method to print the output in the console.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	
	@Test  // this is first test case
	public void Demo() {
		
		System.out.println("hello");
	}
	
	@AfterTest
	public void lastExecution() {
		System.out.println("i ll execute last");
	}
	
	@Test //second test case
	public void exam() {
		System.out.println("bye");

	}

}

/* Annotations
 @Test - to run the test cases without main method, for that u need install testNG pluggin and import it.
 @Beforesuite and @AfterSuite. these methods run before and after the suite. xml level
 @BeforeTest and @AfterTest. these methods run before and after the all the tests within a test module. xml level
 @BeforeClass and AfterClass. these methods run before and after the other methods in the class, executes once if the method present in class. class level
 @BeforeMethod and @AfterMethod. these methods run everytime a method is run within the class. class level */

/* Groups
 @Test(groups = {"AnyName"}) ---> is the syntax, attach a tag after @test and include or exclude the groups in xml file */

/* Annotations helper
 1) @Test(dependsOnMethod = {"Method Name"})  ----?> the method on which it depends run first
 2) @Test(enabled = false) ----> to skip this method, used when we already know the method is failing and dont want to show the red flag all the time.*/
