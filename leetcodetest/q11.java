package leetcodetest;

public class q11 {
	public static void main (String[] args) {
		int height[] = {1,1};
		
		int ans = maxArea(height);
		
		System.out.println(ans);
		
	}
	
	
	public static int maxArea(int[] height) {
        
		//Counters used to iterate through the list
		int left = 0;
		int right = height.length-1 ; 
		//Used to store the return value
		int rtn = 0;
	
		//While beginning counter is less than end counter
		while(left < right) {
			//If the value at beginning counter is less than the value at end counter
			if(height[left] < height[right]) {
				//If value at index left * width(right-left) > rtn than set the return value to that equation
				if(height[left]*(right-left) > rtn) {
					rtn = height[left]*(right-left);
				}
				//increment left no matter what
				left++;
				//Continue to avoid using below statements
				continue;
			}else if(height[right] < height[left]) {
				//If value at index right is less than value at left index
				if(height[right]*(right-left) > rtn) {
					//If value at index right * width(right-left) > rtn than set the return value to that equation
					rtn = height[right]*(right-left);
				}
				//increment right not matter what
				right--;
				//continue to avoid using below statement
				continue;
			}else {
				/*
				 * otherwise since the values at index right and left are the same 
				 * apply the area equation and check if its greater than return, if it is
				 * set rtn equal to it and increment left to continue iterating
				 */
				if(height[left]*(right-left) > rtn) {
					rtn = height[left]*(right-left);
				}
				left++;
			}
		}
		//return the return value 
		return rtn;
    }
	
}
