package leetcodetest;

import java.util.Arrays;

public class q169 {
	public static void main (String[] args) {
		
		
	}
	
	public int majorityElement(int[] nums) {
		// SOl 1 super slow
		//		int counter = 0;
//        int temp = 0;
//        int maj = nums.length/2;
//
//        for(int i = 0; i < nums.length; i++){
//     
//            for(int j = 0; j < nums.length; j++){
//                if(nums[i] == nums[j]){
//                    counter++;
//                }
//            }
//
//            if(counter > maj){
//                temp = nums[i];
//                break;
//            }else{
//                counter = 0;
//            }
//        }
//        return temp;
		
		//Sol 2
		Arrays.sort(nums);
		
		int temp = nums[nums.length/2];
		
		return temp;
		
    }
}
