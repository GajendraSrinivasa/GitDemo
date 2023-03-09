
public class IfElse {

	public static void main(String[] args) {

		int[] a = { 7, 11, 17, 24, 31, 32, 39, 44 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				count++;

			}
		}
		System.out.println("there are " + count + " even numbers");

	}

}
