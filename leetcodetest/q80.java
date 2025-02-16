package leetcodetest;

public class q80 {
	public static void main (String[] args) {
		int nums[] = {0,0,1,1,1,1,2,3,3};
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		removeDuplicates(nums);
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
	
	public static void removeDuplicates(int[] nums) {
		//counter for valid index's, can start at 2 since there will always be two index's and you can assume there fine as were only checking for 3+ in a row.
		int k = 2;

		for(int i = 2 ; i < nums.length ; i++) {
			//Start at k, check if nums[i] != the value at two index's behind
			if(nums[i] != nums[k-2]) {
				// if ^ true than set the value at k to the value at i
				nums[k] = nums[i];
				//increment k by one as a new valid index has been added
				k++;
			}
			//If the if statement fails keep k at the same index as it is an invalid and will need to be replaced.
			//In essence this uses k to go backwards and check back over its own work.
			
		}
		
    }
}
