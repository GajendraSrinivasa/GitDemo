package javaPart1;

public class OverrideChild extends OverrideParent {
	
	public void gear( ) {
		System.out.println("child gear");
	}
	public void colour() {//the method is overridden (the same method name with same signature and same arguments present in the OverrideParent class)
		System.out.println("Green");  // the green up arrow symbol beside 8 (8th line) indicates overriding
	}

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideChild c = new OverrideChild();
		c.Engine();
		c.gear();
		c.colour();

	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideParent c = new OverrideChild(); // reference is parent class, but the object is child class. can call methods present only in parent class.
		c.Engine();  // parent engine
		c.colour();  // Green. but, colour method is overridden , it calls the overidden method

	}

}
