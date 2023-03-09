package javaPart1;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{5,3,2,8}, {9,6,12,1}, {6,2,8,16}, {5,4,3,2}};
		int min = a[0][0];
		int min_col = 0;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0; j<4; j++)
			{
				if(a[i][j] < min)
				{
					min = a[i][j];
					min_col = j;
				}
			}
		}
		System.out.println(min);
		System.out.println(min_col);
		
		int k= 0;
		int max_value = a[0][min_col];
		while(k<4)
		{
			if(a[k][min_col] > max_value)
			{
				max_value = a[k][min_col];
			}
			k++;
		}
		System.out.println(max_value);

		
		

	}

}
