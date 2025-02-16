package leetcodetest;

public class q202 {

	public static void main (String[] args) {
		//Bull shit question that required recursion and a whole bunch of other shit, come back to it 
		
	}
	
	
	public static boolean isHappy(int n) {
        
		while(true) {
			String s = Integer.toString(n);
			n = 0;
			
			for(int i = 0 ; i < s.length(); i++) {
				 int tmp = s.charAt(i)-'0';
				 n+= tmp;
			}
			
			if(n == 1) {
				return true;
			}else if(n == 4) {
				return false;
			}
		}
		
		
		
    }
}
