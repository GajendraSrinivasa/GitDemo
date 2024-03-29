package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// starts with c and ends with h. sort it print the second element.
		
		String[] a = {"cthash", "common", "xtreee", "criplish", "wagoR"}; // a is array
		List<String> names = Arrays.asList(a); // names is array list
		
		List<String> b = names.stream()
		.filter(f-> f.startsWith("c"))
		.filter(g->g.endsWith("h"))
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println(b.get(1));

	}

}
