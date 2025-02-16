package leetcodetest;

public class q55 {
	public static void main (String[] args) {
		
		int nums[] = {4,2,0,0,1,1,4,4,4,0,4,0};
		
		boolean check = canJump(nums);
		
		System.out.println(check);
		
	}
	
	public static boolean canJump(int[] nums) {
        
		int i = 0;
		int temp = 0;
		int temp2 = 0;
		
		while(true) {
			if(i >= nums.length || nums.length == 1 || i + nums[i] >= nums.length-1 ) {
				return true;
			} else if(nums[i] == 0) {
				return false; 
			}else {
				
				for(int j = i+1; j <= nums[i]+i ; j++) {
					if(nums[j+nums[j]] >= nums.length) {
						return true;
					}else if(temp <= nums[j] && nums[j] != 0 && nums[j+nums[j]] != 0 ) {
						temp = nums[j];
						temp2 = j;
					}
				}
				
				if(temp == -1) {
					return false;
				}
				
				i = temp2;
				temp = -1;
				temp2 = -1;
			}
		}
		
			
    }
}
