package leetcodetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class q15 {
	public static void main (String[] args) {
		
		
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rtn = new ArrayList<>();
        
        //Sort through the inital list so I can use the 2 pointer method
        Arrays.sort(nums);
        
        for(int i = 0 ; i < nums.length ; i++) {
        	//Check for duplicates since they cant be included in the answer
        	if(i != 0 && nums[i] == nums[i-1]) {
        		continue;
        	}
        	
        	//Two pointers to start and beginning and end
    		int j = i+1;
    		int k = nums.length -1;
    		
    		//While j < k aka while the middle checker is less than the end checker
    		while (j < k) {
    			//If the three numbers added is less than 0 increase middle checker as we need bigger numbers
    			if(nums[i] + nums[j] + nums[k] <0) {
    				j++;
    			}else if(nums[i] + nums[j] + nums[k]  > 0) {
    				//If the two numbers added is greater than the target than decrease back checker as we need smaller numbers
    				k--;
    			}else {
    				
    				//Add this new array list to the return array list
    				rtn.add(Arrays.asList(nums[i], nums[j], nums[k]));
    				//Increment j as you need to start checking at the next value
    				j++;
    				
    				//Check for duplicates again as they are not allowed in the solution
    				while(j < k && nums[j] == nums[j-1]) {
    					j++;
    				}
    			}
    		}
        }
        
        return rtn;
    }
	
}
