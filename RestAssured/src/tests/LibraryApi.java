package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class LibraryApi{

		
		@Test(dataProvider = "BooksData")
		public void addBook(String isbn, String aisle) {
			
			RestAssured.baseURI = "https://rahulshettyacademy.com";
			String getResponse = given().log().all().header("Content-Type","application/json").
					body(payload.addbook(isbn, aisle)).
			when().post("/Library/Addbook.php").
			then().assertThat().statusCode(200).
			extract().response().asString();
			
			JsonPath js = ReUsableMethods.rawToJson(getResponse);
			String Id = js.getString("ID");
			System.out.println(Id);
			
		}
		
		
		@DataProvider(name = "BooksData")
		public Object[][] getData() {
			return new Object[][] {{"effes", "895"},{"djhsjdhs", "456"},{"hgfhs", "125"}};
		}
		
		
		
		
		
	/*	@Test
		public void deleteBook() {
			
			RestAssured.baseURI = "https://rahulshettyacademy.com";
			String getResponse = given().log().all().header("Content-Type","application/json").
					body(payload.
		}*/

}
