package leetcodetest;

public class q151 {
	public static void main(String args[]) {
		String s = "  This   is    a test ";
		
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
		 s= s.trim();
		 
		 String[] temp = s.split(" ");
		 
		 String rtn = "";
				 
		 for(int i = temp.length-1 ;  i>= 0 ; i--) {
			 if(temp[i] == "") {
				 continue;
			 }
			 
			 if(i != 0) {
				 rtn += temp[i].trim() + " ";
			 }else {
				 
				 rtn += temp[i].trim();
			 }
		 }
		
		return rtn;
	}
}
