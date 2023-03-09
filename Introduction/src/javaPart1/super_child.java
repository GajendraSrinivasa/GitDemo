package javaPart1;

public class super_child extends super_parent {
	
	// constructor in both parent and child class
	public super_child(int a)
	{super(4);
		System.out.println("child constructor");
	}
	
	// same variable in both parent and child class
	String name = "Gaja";
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);

	}
	
	// same method name in both parent and child class
	public void getdata()
	{
		super.getdata();
		System.out.println("In child class");

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		super_child sc = new super_child(5);
		sc.getStringdata();
		sc.getdata();
	}
	}
