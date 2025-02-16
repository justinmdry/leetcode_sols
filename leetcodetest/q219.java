package leetcodetest;

import java.util.HashMap;
import java.util.Map;

public class q219 {

	public static void main(String args[]) {
		/*
		 * The function contains a valid solution but not the most optimal
		 */
		int[] nums = {1,2,3,4,5,6,7,8,9,9};
		int k = 3;
		
		System.out.println(containsNearbyDuplicate(nums,k));
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        //Map used to store values
		Map<Integer, Integer> seen = new HashMap<>();
		
		//Iterate through nums.length
		for(int i = 0 ; i < nums.length ; i++) {
			//Store the value to be put into seen
			int val = nums[i];
			//If the number has already been seen (ie nums[i]==nums[j]) and abs(i-j) <= k
			if(seen.containsKey(nums[i]) && Math.abs(i-seen.get(val)) <= k){
				//return true
				return true;
			}
			//Otherwise put the value into seen as the key and the index as the value.
			seen.put(val, i);
		}
		//If this point is reached then there has never been a case which the test results in true so return false
		return false;
    }
}
