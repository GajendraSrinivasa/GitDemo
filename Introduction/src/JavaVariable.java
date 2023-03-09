
public class JavaVariable {

	public static void main(String[] args) {

		// VARIABLES

		// int mynum =10;
		char letter = 'G';
		String myname = "Gajendra";
		// boolean mycard = true;
		// double dec = 5.99;

		System.out.println("My name is " + myname + "." + " Starts with letter " + letter);

		// ARRAYS - TYPE 1

		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 9;

		System.out.println(arr[1]);

		// ARRAYS TYPE 2

		int[] arr2 = { 20, 21, 56, 63, 89 };

		System.out.println(arr2[1]);

		// FOR LOOP

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		// FOR LOOP STRINGS

		String[] name = { "Gaj", "Sri", "Reddy" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		// ENHANCED FOR LOOP

		for (String G : name) {
			System.out.println(G);
		}

	}

}
