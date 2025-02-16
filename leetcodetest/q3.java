package leetcodetest;

public class q3 {
	public static void main (String[] args) {
		
		
	}
	
	public int removeDuplicates(int[] nums) {
	    //you can assume the first element is a unique element so start the counter at 1   
		int k = 1;

	       for(int i = 0 ; i < nums.length-1 ; i++){
	    	   //Iterate through nums until you find a spot where one value is not equal to the value next to it (ie not a duplicate)
	            if(nums[i] != nums[i+1]){
	            	//Insert the new unique number which is an index further to account for last number
	            	//at nums[k] than increment k.
	                nums[k++] = nums[i+1];
	            }
	       }

	       return k;
	    }
}
