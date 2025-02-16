package leetcodetest;

public class q392 {
	public static void main (String[] args) {
		String s = "acb";
		String t = "ahbgdc";
		
		boolean check = isSubsequence(s,t);
		
		System.out.println(check);
		
	}
	
	
	public static boolean isSubsequence(String s, String t) {
		 
        if(s.length() == 0){
            return true;
        }else if (t == s){
            return true;
        }else if(t.length() == 0 || s.length() > t.length()){
            return false;
        }else if (s.length() == 1) {
        	if(t.contains(s)) {
        		return true;
        	}else {
        		return false;
        	}
        }
        
        //Two pointers used to iterate through both strings
		int i = 0;
        int k = 0;
        
        //Iterate through t
        while(i < t.length()) {
        	/*
        	 * if the char at index i in t equals
        	 * to the char at index k in s
        	 * increment both k and i
        	 */
        	if(t.charAt(i) == s.charAt(k)) {
        		k++;
        		i++;
        	}else {
        		//Otherwise just increment i
        		i++;
        	}
        	
        	if(k == s.length()) {
        		//If k == s.length()-1 (to account for 0 indexing) than return true
        		//As the substring is present
        		return true;
        	}
        }
		
		
		return false;
    }
}
