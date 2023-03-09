package javaPart1;

public class NestedLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=1; i<7; i++)
		{
			for(int j=1;j<=i;j++)
			{
				
					System.out.print(j);
					System.out.print("\t");
			}	
			System.out.println("");
		}
*/
		int k=1;
		for(int i=1; i<5; i++)
		{
			for(int j=1;j<=i;j++)
			{
				int product = k*3; 
				System.out.print(product);
				System.out.print("\t");
				k++;
			}	
			System.out.println("");
		}
		
	}

}
