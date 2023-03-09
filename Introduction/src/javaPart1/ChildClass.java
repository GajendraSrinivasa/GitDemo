package javaPart1;

public class ChildClass extends PatrentClass {
	
	public void Engine() {
		System.out.println("Engine code is implemented");
	}
	public void colorclass() {
		System.out.println(colour);  // colour is defined as red in the parent class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c = new ChildClass();
		c.colorclass();   // method is defined in current class, but colour defined as red in parent class
		c.Engine();  // method created in this class
		c.Brakes();  // method created in the parent class

	}

}

