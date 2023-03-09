
public class AccessMethods {     // AccessMethods is class name

	public static void main(String[] args) {      // this is a method of class level
		
		// if u want to access the method getData(), create an object of getData's class
		// If u want to access a method of a class, create an object of that class 
		
		AccessMethods d = new AccessMethods();  // object (d) is created, of the class AccessMethods.
		String name1 = d.getData();    // name1 is string variable 
		System.out.println(name1);
		
		String name2 = getuserData();
		System.out.println(name2);
		
	}
	
	public String getData() {     // this is also a method. return is a string type
		System.out.println("Hello World");
		return "Gajendra";
	}
	
	public static String getuserData() {     // this is a method of class level
		System.out.println("Hello India");
		return "Rajendra";
	}
}
