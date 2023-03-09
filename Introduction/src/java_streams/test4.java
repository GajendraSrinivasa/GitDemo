package java_streams;

import java.util.Arrays;
import java.util.List;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using map to modify the stream.
		String[] a = {"cthash", "common", "xtreee", "criplish", "wagoR"}; // a is array
		List<String> names = Arrays.asList(a); // names is array list
		
		names.stream()                      // a copy of items in names are taken to streams 
		.filter(s->s.endsWith("h"))			// now 's' filters the items ending with 'h' in stream 
		.sorted()							// the filtered items are sorted
		.map(k->k.toUpperCase())			//using map the items in stream are modified to upper case by 'k'
		.forEach(g->System.out.println(g)); // the items in k are taken by 'g' and prints in console
		

	}

}
