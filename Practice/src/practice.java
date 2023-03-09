

import java.util.HashSet;
import java.util.Set;

public class practice {
	
	
	public static void main(String[] args) {
		
		practice d = new practice(); 
		int lengthOfSubstring = d.lengthOfLongestSubstring("pwwkweewz");
		System.out.println(lengthOfSubstring);
		
		
	}
	

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

    public boolean checkRepetition(String s, int start, int end) {
        Set<Character> chars = new HashSet<>();

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if(chars.contains(c)){
                return false;
            }
            chars.add(c);
        }

        return true;
    }
}
