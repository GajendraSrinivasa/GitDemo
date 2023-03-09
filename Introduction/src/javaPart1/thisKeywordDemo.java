package javaPart1;

public class thisKeywordDemo {
	
	int a= 2; // global variable
	
	public void getData() 
	{
		int a = 3; //local variable
		System.out.println(a);  // prints local variable
		System.out.println(this.a); // prints global variable
		int b = a +this.a;  // sum of local and global variable
		System.out.println(b);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeywordDemo tkd = new thisKeywordDemo();
		tkd.getData();

	}

}
