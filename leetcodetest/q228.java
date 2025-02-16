package leetcodetest;

import java.util.ArrayList;
import java.util.List;

public class q228 {
	public static void main (String[] args) {
		
		int nums[] = {0,2,3,4,6,8,9};
		
		List<String> test = summaryRanges(nums);
		
		System.out.println(test.toString());
	}
	
	public static List<String> summaryRanges(int[] nums){
		//Create an empty list to store the solution
		List<String> rtn = new ArrayList<>();
		
		//If nums.length == 0 then just return the empty list
		if(nums.length == 0) {
			return rtn;
		}
		
		//Otherwise create two pointers to iterate through the list
		int start = 0;
		int checker = 1;
		
		//While start < checker and checker is < nums.length
		while(start < checker && checker < nums.length) {
			//If the value at index checker - the value before is not equal to zero
			if(nums[checker] - nums[checker-1] != 1) {
				//See how far checker has moved from the start before printing for formating reasons
				if(checker-1-start == 0) {
					
					rtn.add( ""+ nums[start]);
					start = checker;
					checker++;
				}else {
					//Add the new range to the list
					rtn.add(nums[start] + "->" + nums[checker-1]);
					//Set start to checker since this is the new starting position
					start = checker;
					//Increment checker 
					checker++;
				}

			}else {
				//Otherwise just increment checker as its still a valid range 
				checker++;
			}
		}
		 
			//Since we have reached the end of the loop we know there is still a possible valid range or end number
			//Therefore complete the same check for formatting and then add the final range/ number
			if(checker-1-start == 0) {
				
				rtn.add( ""+ nums[start]);
				start = checker;
				checker++;
			}else {
				rtn.add(nums[start] + "->" + nums[checker-1]);
				start = checker;
				checker++;
			}
		//Then return the list as it is now the correct answer 
		return rtn;
	}
}
