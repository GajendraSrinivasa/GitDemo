package javaPart1;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// my way
		int k=1;
		for(int i=0; i<6; i++)
		{
			for(int j=0;j<6-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}  // prints till 21
		
	// extra fun
		for(int i=0; i<5; i++)
		{
			for(int j=0;j<=i+1;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}// prints from 22 to 41
		
		
		
		
		
		

	}

}
