package leetcodetest;

public class q167 {
	public static void main (String[] args) {
		int numbers[] = {-1,0};
		int target = -1;
		
		int ans[] = twoSum(numbers, target);
		
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		
		//Return array
		int[] ret = new int[2];
		
		//Two pointers to start and beginning and end
		int i = 0;
		int k = numbers.length -1;
		
		//While i < k aka while the start checker is less than the end checker
		while (i < k) {
			//If the two numbers added is less than target increase beginning checker as we need bigger numbers
			if(numbers[i] + numbers[k] <target) {
				i++;
			}else if(numbers[i] + numbers[k] > target) {
				//If the two numbers added is greater than the target than decrease back checker as we need smaller numbers
				k--;
			}else {
				/*
				 * Otherwise we know its = target so set the return array = index's + 1 
				 * and break the loop
				 */
				ret[0] = i+1;
				ret[1] = k+1;
				break;
			}
		}
		
		
		return ret;
    }
}
