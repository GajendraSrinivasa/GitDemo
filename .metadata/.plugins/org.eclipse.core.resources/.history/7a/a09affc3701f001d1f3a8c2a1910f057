package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"cthash", "common", "xtreee", "criplish", "wagoR"}; // a is array
		List<String> names = Arrays.asList(a); // names is array list
		
		List<String> fames = Arrays.asList("author", "reader", "zoom", "mankind");
		
		// 1. have two lists. concatinate them.
		
		Stream<String> nf = Stream.concat(names.stream(), fames.stream());
		//nf.sorted().forEach(g->System.out.println(g));

		//2.  check if the item zoom is available in the list using assertions. to do this the list shouldnot be modified, commented last line
		boolean flag = nf.anyMatch(p->p.equalsIgnoreCase("zoom"));
		Assert.assertTrue(flag);
		
		

	}

}
