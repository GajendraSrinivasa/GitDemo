package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using java streams (these are lambda expressions)
				// 1. count number of items
				//ArrayList<String> names = new ArrayList<String>(); // instead of creating names list first
				List<String> names = Arrays.asList("chash", "common", "xtreee", "criplish", "wagoR"); 
				long c = names.stream().filter(s-> s.startsWith("c")).count();
				System.out.println(c);	
	//OR
				long d = Stream.of("chash", "common", "xtreee", "criplish", "wagoR").filter(s-> s.startsWith("c")).count();
				System.out.println(d);
	}
}
