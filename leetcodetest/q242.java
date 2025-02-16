package leetcodetest;

public class q242 {
	public static void main (String[] args) {
		
		
	}
	
	public static boolean isAnagram(String s, String t) {
        
		
		 int[] alpahbets_counter = new int[26];
		 
		 if(s.length() > t.length()) {
			 for(char c : s.toCharArray()) {
				 alpahbets_counter[c-'a']++;
			 }
			 
			 for(char c: t.toCharArray()) {
				 if(alpahbets_counter[c-'a'] == 0) {
					 return false;
				 }
				 alpahbets_counter[c-'a']--;
			 }
		 }else {
			 for(char c : t.toCharArray()) {
				 alpahbets_counter[c-'a']++;
			 }
			 
			 for(char c: s.toCharArray()) {
				 if(alpahbets_counter[c-'a'] == 0) {
					 return false;
				 }
				 alpahbets_counter[c-'a']--;
			 }
		 }
		 
		 
		
		
		return true;
    }
}
