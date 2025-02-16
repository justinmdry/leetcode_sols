package leetcodetest;

import java.util.ArrayList;
import java.util.List;

public class q54 {
	public static void main (String[] args) {
		int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		List<Integer> test = spiralOrder(matrix);
		
		String ans = test.toString();
		
		System.out.println(ans);
		
	}
	
	 public static List<Integer> spiralOrder(int[][] matrix) {
	     //Return list    
		 List<Integer> rtn = new ArrayList<Integer>();
	     
		 //Create pointers for positions in the matrix
		 int left = 0;
		 int right = matrix[0].length-1;
		 int top = 0;
		 int bottom = matrix.length-1 ; 
		 
		 //While left < right and top < bottom iterate through loop
		 while(left <= right && top <= bottom) {
			 //From index left to right iterate i
			 for( int i = left;  i<= right ; i++) {
				 //Add matrix[top][i] to list (first iteration over top row in order
				 rtn.add(matrix[top][i]);
			 }
			 
			 //Increment top as the next time through you will go in row 1 (0 indexed)
			 top++;
			 
			 //Go through colum at right-1 and add to return list
			 for(int i = top ; i <= bottom; i++) {
				 rtn.add(matrix[i][right]);
			 }
			 //Decrement right as next time through the final col will be right-1
			 right--;
			 
			 
			 //If there are still more rows to go through
			 if(top <= bottom) {
				 //add the current bottom row from right to left
				 for(int i = right; i >= left; i--) {
					 rtn.add(matrix[bottom][i]);
				 }
				 bottom--;
			 }
			 
			 //If there are still more columns to go through
			 if(left <= right) {
				 //Add the current column from bottom to top
				 for(int i = bottom ; i >= top ; i--) {
					 rtn.add(matrix[i][left]);
				 }
				 left++;
			 }
			 
		 }
	     
	     
	     //return the rtn list as this is the solution.
	     return rtn;
	 }
}
