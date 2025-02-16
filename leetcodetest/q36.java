package leetcodetest;

import java.util.HashSet;
import java.util.Set;

public class q36 {

	public static void main (String[] args) {
		char board[][] = {{'5','3','.','.','7','.','.','.','.'},
						{'6','.','.','1','9','5','.','.','.'},
						{'.','9','8','.','.','.','.','6','.'},
						{'8','.','.','.','6','.','.','.','3'},
						{'4','.','.','8','.','3','.','.','1'},
						{'7','.','.','.','2','.','.','.','6'},
						{'.','6','.','.','.','.','2','8','.'},
						{'.','.','.','4','1','9','.','.','5'},
						{'.','.','.','.','8','.','.','7','9'}};
		
		boolean check = isValidSudoku(board);
		
		System.out.println(check);
		
	}
	
	public static boolean isValidSudoku(char[][] board) {
		boolean rtn = true;
		//Use a hashset as they do not allow duplicates and thus can check for them.
		
		Set<String> nums = new HashSet<String>();
		
		//Iterate through columns
		for(int i = 0 ; i < board.length ; i++) {
			//Iterate through rows
			for(int j = 0; j <board[i].length ; j++) {
				//Get your character
				char tmp = board[i][j];
				if(tmp == '.') {
					//If tmp is an empty value there is nothing to check so continue the loop
					continue;
				}else {
					//Otherwise check for duplicates of tmp in rows, columns, and 3x3 box's
					
					if(!nums.add(tmp+ "in row" + i) || !nums.add(tmp+ "in column "+j) || !nums.add(tmp +"in block" +i/3 + '-' + j/3)) {
						//If there is a duplicate (ie .add(...) returns false then set rtn value to false
						//Otherwise add it to the hashset and continue
						rtn = false;
					}
				}
			}
		}
		
		
		
		return rtn;
	}
	
}
