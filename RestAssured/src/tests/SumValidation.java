package tests;

import org.testng.annotations.Test;

import files.payload;
import io.restassured.path.json.JsonPath;

public class SumValidation {
	
	JsonPath js = new JsonPath(payload.coursePrice());
	
	@Test
	public void sumOfCources() {
		
	}

}
