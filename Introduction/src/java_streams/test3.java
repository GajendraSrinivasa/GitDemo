package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 2. print all the names with length > 5
		// if u have array u can convert to array list
		
		String[] a = {"chash", "common", "xtreee", "criplish", "wagoR"}; // a is array
		List<String> names = Arrays.asList(a); // names is array list
		
		names.stream().filter(s-> s.length()>5).forEach(s->System.out.println(s));
		
//OR
		
		Stream.of("chash", "common", "xtreee", "criplish", "wagoR").filter(s-> s.length()>5).forEach(s->System.out.println(s));
			
		// if u want only one name which has length >5 --- limit()
		Stream.of("chash", "common", "xtreee", "criplish", "wagoR").filter(s-> s.length()>5).limit(1).forEach(s->System.out.println(s));

	}

}
