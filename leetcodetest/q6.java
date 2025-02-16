package leetcodetest;

public class q6 {
	
	//This is actually question 28, q6 was fucking retarted.

	public static void main (String[] args) {
		String haystack = "a";
		String needle = "a";
		
		int i = strStr(haystack, needle);
		
		System.out.println(i);
		
	}
	
	public static int strStr(String haystack, String needle) {
		
		if(needle.length() > haystack.length()) {
			/*
			 * if the length of needle is longer than haystack
			 * then return -1 as there is no solution and 
			 * the rest of the code would throw an exception
			 */
			return -1;
		}
		
		//Iterate through the haystack string 
		for(int i  = 0 ; i < haystack.length() ; i++) {
			/*
			 * If the char at index i in haystack is equal to the char at index 0 in needle 
			 */
			if(haystack.charAt(i) == needle.charAt(0) && needle.length() + i < haystack.length()) {
				/*
				 * Than create a substring from i to needle.length()+i and compare it to needle to see if there 
				 * equivalent
				 */
				if(haystack.substring(i, needle.length()+i).equals(needle)) {
					//If the above is true than set rV = i and break the loop as you are done.
					return i;
				}
			}
		}
		
		//If both cases above fail than return -1 as there is no solution
		return -1;
		
    }
}
