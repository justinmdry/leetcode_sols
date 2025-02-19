package leetcodetest;

public class q643 {

	public static void main(String args[]) {
		int[] test = {-1};
		
		System.out.println(findMaxAverage(test, 1));
	}
	
	//This solution is O(n)
	public static double findMaxAverage(int[] nums, int k) {
		if(nums.length == 1 && k ==1) {
			return nums[0]/k;
		}
		
		double max_A = 0;
        double sum = 0;

        for(int i = 0 ; i < k; i++ ){
            sum += nums[i];
        }

		max_A = sum;

		for(int i = k; i < nums.length ; i++){
            sum += nums[i] - nums[i-k];
            // ^ This allows you to make it in O(n) time, it in the same step adds the next step in the window and
            //Removes the previous.
            max_A = Math.max(max_A, sum);
        }
		
		
		return max_A/k;
	}
}
