package leetcodetest;

public class q283 {
	public static void main(String args[]) {
		int[] nums = {4,2,4,0,0,3,0,5,1,0};
		moveZeroes(nums);
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static void moveZeroes(int[] nums) {
		/*
		 * Below is the first solution, it is farily slow however gets the job done
		 * under it will be a much quicker solution
		 */
//		int i = 0;
//		int j = 1;
//		
//		while(j < nums.length && i < nums.length) {
//			
//			if(nums[i] != 0) {
//				i = j;
//				j++;
//				continue;
//			}
//			
//			if(nums[j] == 0) {
//				j++;
//				continue;
//			}
//			
//			int temp = nums[j];
//			nums[j] = nums[i];
//			nums[i] = temp;
//			i++;
//			
//			
//			//EOW
//		}
		
		
		int i = 0;
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i++;
			}
		}
		
		//EOF
	}
}
