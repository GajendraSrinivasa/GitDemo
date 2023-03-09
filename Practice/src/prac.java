
import java.util.Arrays;

public class prac {
	
	
	
	
	public int solution(int[] arr) {

        Arrays.sort(arr);

        int smallest = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                smallest++;
            }
        }

        return smallest;
    }

}
	