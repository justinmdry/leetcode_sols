package leetcodetest;

public class q209 {
	public static void main(String args[]) {
		int target = 15;
		int nums[] = {2,3,1,2,4,3};
		
		System.out.println(minSubArrayLen(target, nums));
	}
	
	public static int minSubArrayLen(int target, int[] nums) {
		//This will be used to return the k value of the sliding window 
		int out = Integer.MAX_VALUE;
		//Used as a pointer for the left side of the sliding window
		int left = 0;
		//Used to get the current sum of the window
		int cur_sum = 0;
		
		//Iterate through nums
		for(int right = 0 ; right < nums.length ; right++) {
			//Add nums[right] to cur_sum to update the sum
			cur_sum += nums[right];
			
			//If cur_sum >= target then loop 
			while(cur_sum >=target) {
				//If the current k value is less than the previous lowest k value
				if(right - left + 1 < out) {
					//Update the return variable
					out = right-left+1;
				}
				//Subtract the left most value from cur_sum since we are now reducing the window
				cur_sum -= nums[left];
				//Move the left side of the window to the right
				left++;
			}
		}
		
		//If out is still equal to Integer.MAX_VALUE then return 0 as it has not been changed 
		if( out == Integer.MAX_VALUE) {
			return 0;
		}else {
			//Otherwise return the return variable out.
			return out;
		}
		//This solution works but is extremely unefficient. Above is a much more efficient one.
		//It is the proper sliding window technique.
//		int out = Integer.MAX_VALUE;
//        if(nums.length == 1 && target == nums[0]){
//            return 1;
//        }
//
//        for(int i = 0 ; i < nums.length ; i++){
//            int curr_sum = 0;
//            for(int j = i ; j < nums.length ; j++){
//                curr_sum += nums[j];
//
//                if(curr_sum >= target && out > j-i+1){
//                    out = j-i+1;
//                    break;
//                }
//            }
//        }
//
//        if(out ==Integer.MAX_VALUE){
//            return 0;
//        }else{
//            return out;
//        }
    }
}
