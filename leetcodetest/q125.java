package leetcodetest;

	public class q125 {
	public static void main (String[] args) {
		String s = "A man, a plan, a canal: Panama";
		
		boolean iP = isPalindrome(s);
		
		System.out.println(iP);
		
		
	}
	
	public static boolean isPalindrome(String s) {
		//Solution is correct but is not the most efficient answer, it is O(n)
        
		//Used to remove punctuation, spaces and send all chars to lower case.
		s = s.replaceAll("\\s|[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(s);
		//Use two pointers to check from last index to first and first index to last
		int k = s.length()-1;
		int i = 0;
		
		/*
		 * While the counter for first to last index is less 
		 * than the counter from last to first index
		 */
		while(i <= k) {
			//If the char at index i is equal to the char at index k
			if(s.charAt(i) == s.charAt(k)){
				//Increase i and decrease k
				i++;
				k--;
			}else {
				//Other wise it is not a palidrone and return false
				return false;
			}
		}
		
		//If this line is reached than it is a palidrome and thus return true
		return true;
    }
}
