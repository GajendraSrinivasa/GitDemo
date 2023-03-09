package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.path.json.JsonPath;

public class complexJsonParse {
	/*
	 * TestCases 1. Print No of courses returned by API
	 * 
	 * 2.Print Purchase Amount
	 * 
	 * 3. Print Title of the first course
	 * 
	 * 4. Print All course titles and their respective Prices
	 * 
	 * 5. Print no of copies sold by RPA Course
	 * 
	 * 6. Verify if Sum of all Course prices matches with Purchase Amount
	 */
	
	static JsonPath js = new JsonPath(payload.coursePrice());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int courseCount = js.getInt("courses.size()");
		System.out.println("1. Number of courses: " + courseCount);

		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("2. Purchase amount is: " + purchaseAmount);

		String firstCourse = js.getString("courses[0].title");
		System.out.println("3. The first course is : " + firstCourse);

		System.out.println("4. The list of all courses with the course prices: ");
		for (int i = 0; i < courseCount; i++) {
			String allCourses = js.get("courses[" + i + "].title");
			int allPrices = js.get("courses[" + i + "].price");
			// String allPrices = js.get("courses["+i+"].price").toString();
			System.out.println("	The price for " + allCourses + " is " + allPrices);

		}
		for (int i = 0; i < courseCount; i++) {
			String allCourses = js.get("courses[" + i + "].title");
			if (allCourses.equalsIgnoreCase("RPA")) {
				int copiesSold = js.getInt("courses[2].copies");
				System.out.println("5. RPA course - copies sold: " + copiesSold);
				break;
			}
		}

	}
	
	@Test
	public void sumOfCourses(){
		
		int sum = 0;
		int courseCount = js.getInt("courses.size()");

		for (int i = 0; i < courseCount; i++) {
			int prices = js.getInt("courses[" + i + "].price");
			int copies = js.getInt("courses[" + i + "].copies");
			int courseSum = prices * copies;
			sum = sum + courseSum;
		}
		System.out.println("6. Sum of all the courses for all the copies: " + sum);
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, purchaseAmount);

	}
}
