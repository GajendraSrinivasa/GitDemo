package Part3;

import java.util.HashSet;
import java.util.Iterator;

public class hastSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("UK");
		hs.add("USA");
		hs.add("INDIA");
		hs.add("UK");
		hs.add("SHE");
		hs.add("THEY");
		hs.remove("SHE");
		hs.add("HE");
		System.out.println(hs);
		
		Iterator<String> i = hs.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
