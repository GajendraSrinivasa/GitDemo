package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print unique values and sort
		List<Integer> j =  Arrays.asList(3,2,2,7,5,1,9,7);
		Set<Integer> y = j.stream().sorted().collect(Collectors.toSet()); // collected to set because set stores only unique values.
		System.out.println(y);

	}

}
