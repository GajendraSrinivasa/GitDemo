package files;

public class payload {
	
	public static String coursePrice() {
		
		return "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}";
	}
	
	
	public static String addbook(String isbn, String aisle) {
		
		return "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
	}
	public static String loginCredentials() {
		return " {\r\n"
				+ "\"username\": \"gajendrabhsh1998\", \r\n"
				+ "\"password\": \"Gaja@1998\" \r\n"
				+ "}";
	}
	
	public static String createIssue() {
		return "{\r\n"
				+ "    \"fields\":{\r\n"
				+ "    \"project\":\r\n"
				+ "    {\r\n"
				+ "        \"key\":\"RSA\"\r\n"
				+ "    },\r\n"
				+ "    \"summary\":\"REST\",\r\n"
				+ "    \"description\": \"My first bug\",\r\n"
				+ "    \"issuetype\":{\r\n"
				+ "        \"name\":\"Bug\"\r\n"
				+ "    }\r\n"
				+ "    \r\n"
				+ "}\r\n"
				+ "}";
	}
	public static String addComment(String commentBody) {
		return "{\r\n"
				+ "    \"body\": \""+commentBody+" \",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}";
	}
}
