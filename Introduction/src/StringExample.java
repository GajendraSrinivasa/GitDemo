
public class StringExample {

	public static void main(String[] args) {
		
		String s = "Gajendra Reddy Academy";
		
		String[] splittedString = s.split("Reddy"); // splitting w.r.t to reddy
		
		//System.out.println(splittedString[0]);
		System.out.println(splittedString[0].trim()); // just to remove the white spaces, trim() method is used
		
		//System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());

		for(int i=s.length()-1; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
		

	}

}
