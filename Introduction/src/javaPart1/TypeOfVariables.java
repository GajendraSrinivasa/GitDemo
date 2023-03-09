package javaPart1;

public class TypeOfVariables {
	
	String name;
	String address;
	static String city = "Bangalore";
	
	public TypeOfVariables(String name, String address)
	{
		this.name = name ;
		this.address = address;
		
	}
	
	public void getData()
	{
		System.out.println(name +" "+ address +" "+ city);
	}
	
	public void getvar()
	{
		System.out.println(city);
	}
	
	public static void getvar2()
	{
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeOfVariables obj1 = new TypeOfVariables("ram", "varthur");
		TypeOfVariables obj2 = new TypeOfVariables("sham", "hoodi");
		TypeOfVariables obj3 = new TypeOfVariables("tam", "valer");
		
		obj1.getData();
		obj3.getData();
		TypeOfVariables.getvar2(); // static methods can be accessed by class only, objects cannot access static methods.
		obj2.getvar();
		


	}

}
