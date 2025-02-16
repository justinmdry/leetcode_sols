package leetcodetest;

import java.util.Stack;

public class q71 {
	public static void main (String[] args) {
		String path ="/a/../../b/../c//.//";
		
		String ans = simplifyPath(path);
		
		System.out.println(ans);
	}
	
	public static String simplifyPath(String path) {
		
		//Split the string on each /
		String split[] = path.split("/");
		//This is the return string
		String rtn ="";
		//Stack to  be used for building the return string
		Stack<String> temp = new Stack<>();
		
		//For each string in split
		for(String dir : split) {
			//If that string is equal to . or is empty then ignore it and continue at the next string
			if(dir.equals(".") || dir.isEmpty()) {
				continue;
			}else if(dir.equals("..")) {
				//Otherwise if dir equals .. and temp is not empty
				if(!temp.isEmpty()) {
					//Pop the top of the stack
					temp.pop();
				}
			}else {
				//Otherwise it is a valid dir name and thus push it 
				temp.push(dir);
			}
		}
		//Finally build the return string by adding a / to the front then joining all the elements in temp with a / infront.
		rtn = "/" + String.join("/", temp);
		//then return your solution
		return rtn;
	}
}

//Below is a different approach that was good but failed on multiple ..'s in a row
//
//String split[] = path.split("/");
//
//if(split.length == 2 && split[1].equalsIgnoreCase("..")) {
//return "/";
//}
//
//Stack<String> temp = new Stack<>();
//
//for(int i = 0 ; i < split.length; i++) {
//temp.push(split[i]);
//}
//
//
//String rtn = "";
//
//while(!temp.isEmpty()) {
//if(temp.peek().equalsIgnoreCase(".")  || temp.peek().equalsIgnoreCase("")) {
//	temp.pop();
//}else if( temp.peek().equalsIgnoreCase("..") ){
//	int counter = 1;
//	temp.pop();
//	while(counter > 0) {
//		if(temp.peek().equalsIgnoreCase("..")) {
//			counter++;
//			temp.pop();
//			continue;
//		}else if(temp.peek().equalsIgnoreCase(".")  || temp.peek().equalsIgnoreCase("")) {
//			temp.pop();
//		}else {
//			temp.pop();
//			counter--;
//		}
//	}
//}else {
//	rtn = "/"+temp.pop() + rtn;
//}
//}
//return rtn;