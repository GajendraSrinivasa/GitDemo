package java_streams;


import java.util.ArrayList;

public class test1 {
	
	public static void main(String[] args) {
		
		// Regular 
		ArrayList<String> names = new ArrayList<String>();
		names.add("chash");
		names.add("common");
		names.add("xtreee");
		names.add("criplish");
		names.add("wagonR");
		
		
		int count = 0;
		for(int i=0; i<names.size(); i++)
		{
			String n = names.get(i);
			if(n.startsWith("c"))
			{
				count++;
			}
		}
		System.out.println(count);

		}
}
