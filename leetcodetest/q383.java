package leetcodetest;

import java.util.HashMap;

public class q383 {
	public static void main (String[] args) {
		
		String rN = "fihjjjjei";
		
		String m = "hjibagacbhadfaefdjaeaebgi";
		
		System.out.println(canConstruct(rN, m));
		
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
        
		//If ransomNote's length is greater than magazine then return false as there is no possible solution
		if(ransomNote.length() > magazine.length()) {
			return false;
		}
		
		//Otherwise create a hashmap that will be used to create the ransom note
//		HashMap<Integer, Character> ans = new HashMap<Integer,Character>();
//		
//
//		//Used to iterate through ransomNote
//		for(int i = 0 ; i < ransomNote.length(); i++) {
//			//Used to iterate through magazine
//			for(int j = 0 ; j < magazine.length(); j++) {
//				
//				//If the char is present in both ransomNote and magazine
//				if(ransomNote.charAt(i) == magazine.charAt(j)) {
//					//If the char in magazine has not been previously used in ransomNote
//					if(ans.get(j) == null) {
//						//Put it into the hashmap
//						ans.put(j, magazine.charAt(i));
//						
//						if(ans.size() == ransomNote.length()) {
//							//If the size of the hashmap is equal to the length of the ransom note than the solution is present
//							return true;
//						}
//						//Break the j loop if you inputed a char into the hashmap to reduce wasted time
//						break;
//					}
//					
//				}
//				
//			}
//			
//		}
//		
//		//If this point is reached than the note cannot be made and thus return false
//		return false;
		
		// ^ is a solution but it is extremely unefficient , below is a more efficient solution
		
		if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
	
	//Previous attempt at a solution, could be used in optimization
//	for(int i = 0 ; i < magazine.length(); i++) {
//	//Iterate through magazine
//	//If ransomNote contains the char at i in magazine
//	if(ransomNote.contains(magazine.subSequence(i, i+1))) {
//		//If the hashmap does not already contain the character at index i 
//		if(ans.get(i) == null) {
//			//Add it to the hashmap with key = i 
//			ans.put(i, magazine.charAt(i));
//		}
//		
//	
//	}
//	
//	//Compare the hashmaps size to the ransomNote's size, if they are equal than the ransom note can be made and return true
//	if(ans.size() == ransomNote.length()) {
//		return true;
//	}
//	
//}
}
