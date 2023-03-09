package javaPart1;

public class FunctionOverloading {
	
	public void getData(int a) {
		System.out.println(a);
	}
	public void getData(String a) {
		System.out.println(a);
	}
	public void getData(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading  c = new FunctionOverloading();
		c.getData(2);
		c.getData("Gaj");
		c.getData(5, 9);
	}

}
