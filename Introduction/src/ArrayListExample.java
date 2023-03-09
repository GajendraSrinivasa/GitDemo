import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList <String> a = new ArrayList <String> ();
		a.add("gaj");
		a.add("raj");
		a.add("baj");
		a.add("saj");
		
		
		System.out.println(a.get(2));
		a.remove(2);
		System.out.println(a.get(2));
		
	}

}
