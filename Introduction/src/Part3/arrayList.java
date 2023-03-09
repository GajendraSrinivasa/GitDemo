package Part3;

import java.util.ArrayList;


public class arrayList{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Gaja");
		a.add("Rahul");
		a.add("Java");
		a.add("tam");
		System.out.println(a);
		System.out.println(a.contains("Rahul"));
		System.out.println(a.indexOf("tam"));
		System.out.println(a.get(2));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.remove(1));
		a.remove("Java");
		System.out.println(a.size());
		
		

	}

}
