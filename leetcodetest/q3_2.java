package leetcodetest;

import java.util.HashSet;
import java.util.Set;

public class q3_2 {
	public static void main(String args[]) {
		String test = "abcabcbb";
		
		System.out.println(lengthOfLongestSubstring(test));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		int out = 0;
		int left = 0;
		Set<Character> hashS = new HashSet<Character>();
		
		for(int right = 0 ; right < s.length() ; right++) {
			
			while(hashS.contains(s.charAt(right))) {
				if(right - left > out) {
					out = right-left ;
				}
				
				hashS.remove(s.charAt(left));
				left++;
			}
			
			hashS.add(s.charAt(right));
		}
		
		
		
		
		if(out > hashS.size()) {
			return out;
		}else {
			return hashS.size();
		}
		
	}
}
