package javaPart1;

public class ChildAbstractExample extends ParentAbstarctExample {   // use extends wn implementing from a abstract class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstractExample c =new ChildAbstractExample();
		c.colour();
		c.engine();
		c.safety();

	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("color");
	}

}


//1) Interface, abstract class and there differences
//2)implements and extends keywords
//3)multiple inheritance not possible (class Z extends X, Y). X and Y are 2 classes, Z cannot inherit from two classes in java. It's possible in C++.
// In this case we need interface.
//4)lecture 265 for interview type questions based on inheritance.