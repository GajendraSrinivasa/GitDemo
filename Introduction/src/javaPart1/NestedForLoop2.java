package javaPart1;

public class NestedForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	// my way
		int k=1;
		for(int i=5; i>=0; i--)
		{
			for(int j=0;j<6-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}
*/
	// Rahul way
		int k=1;
		for(int i=0; i<6; i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}

	}

}
