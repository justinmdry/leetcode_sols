package leetcodetest;

import java.util.Stack;

public class q20 {

	public static void main (String[] args) {
		String s = "){";
		
		boolean test = isValid(s);
		
		System.out.println(test);
		
	}
	
	public static boolean isValid(String s) {
		//If the length of the string is less than or equal to one than return false (edge case)
		if(s.length() <=1) {
			return false;
		}
		
		
		//This will be the stack used for our logic
		Stack<Character> sol = new Stack<>();
		
		//Iterate through the loop
		for(int i = 0 ; i < s.length() ; i++) {
			//If we have an opening bracket of any kind then simply push it to the stack and continue the loop 
			if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
				sol.push(s.charAt(i));
				continue;
			}
			
			
			if(sol.isEmpty()) {
				//if the first element is not an opening brakcet and the stack is empty then return false
				return false;
			}else {
				//If we have a closing brakcet
				if(s.charAt(i) == ']') {
					//Check that sol.peek() = the appropriate closing bracket
					if(sol.peek() == '[') {
						//Pop it if it is 
						sol.pop();
					}else {
						//Otherwise return false as the conditions have not been met
						return false;
					}
				}else if(s.charAt(i) == '}') {
					if(sol.peek() == '{') {
						sol.pop();
					}else {
						return false;
					}
				}else if(s.charAt(i) == ')') {
					if(sol.peek() == '(') {
						sol.pop();
					}else {
						return false;
					}
				}
			}
	
		}
		
		//If this point is reached then check if the stack is empty, if it is then the conditions have been met and it will return true.
		return sol.isEmpty();
	}
}
