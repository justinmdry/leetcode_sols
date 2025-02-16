package leetcodetest;

import java.util.Stack;

public class q150 {

		public static void main(String args[]) {
			String tokens[] = {"2","1","+","3","*"};
			
			int j = evalRPN(tokens);
			
			System.out.println(j);
		}
		
		public static int evalRPN(String[] tokens) {
			
			Stack<String> temp = new Stack<>();
			
			for(int i = 0; i < tokens.length ; i++) {
				
				if(tokens[i]== "+") {
					
					int sec = Integer.parseInt(temp.pop());
					int first = Integer.parseInt(temp.pop());
					int x = first + sec;
					temp.add(Integer.toString(x));
					continue;
				}else if(tokens[i] == "-") {
					int sec = Integer.parseInt(temp.pop());
					int first = Integer.parseInt(temp.pop());
					int x = first - sec;
					temp.add(Integer.toString(x));
					continue;
				} else if(tokens[i] == "*") {
					int sec = Integer.parseInt(temp.pop());
					int first = Integer.parseInt(temp.pop());
					int x = first * sec;
					temp.add(Integer.toString(x));
					continue;
				}else if(tokens[i] == "/") {
					int sec = Integer.parseInt(temp.pop());
					int first = Integer.parseInt(temp.pop());
					int x = first / sec;
					temp.add(Integer.toString(x));
					continue;
				}
				
				temp.add(tokens[i].toString());
				
			}
			
			
			return Integer.valueOf(temp.pop());
		}
}
