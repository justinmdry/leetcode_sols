package leetcodetest;

public class test1 {
	
	public static void main (String[] args) {
		
		int nums1[] = {0};
		int nums2[] = {1};
		
		int m = 0;
		
		int n = 1; 
		
		merge(nums1, m, nums2, n);
		
		for(int j = 0; j < nums1.length ; j++) {
			System.out.println(nums1[j]);
		}
	}
	
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //start where the numbers at the last number of nums1
		int i = m-1;
		//start at the end of nums2
        int j = n-1;
        //tracker of where to insert element
        int k = m + n -1;
        
        // iterate through the lists until you have completed the index's in nums2
        while(j >=0) {
        	//if there is still an index and the value at nums1 is greater than the value at nums2
        	if(i >= 0 && nums1[i] > nums2[j]) {
        		//insert the value at nums1[i] than decreament the i counter by one
        		nums1[k--] = nums1[i--];
        	}else {
        		//Otherwise insert the value at nums2[j] than decreament the j counter by one 
        		nums1[k--] = nums2[j--];
        	}
        	//You do not need to do any sorting due to the two arrays already being in order.
        }
		
    }
	
	
}
