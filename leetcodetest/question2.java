package leetcodetest;

public class question2 {
	public static void main (String[] args) {
		
		
	}
	
	public int removeElement(int[] nums, int val) {
	    //Pointer used to insert non val numbers into position, also counter for total non val numbers   
		int k = 0;
	       
	        for(int i = 0 ; i < nums.length ; i++){
	            //Iterate through, if number is not equal to val
	        	if(nums[i] != val){
	        		//Insert number into k index and than increment k by one to increase count of non val numbers 
	                nums[k++] = nums[i];
	            }
	        }
	        //Return k as it is expected output.
	        return k;
	    }
}

