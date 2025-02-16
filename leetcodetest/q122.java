package leetcodetest;

public class q122 {

	public static void main (String[] args) {
		int prices[] = {7,6,4,3,1};
		
		int k = maxProfit(prices);
		
		System.out.println(k);
		
	}

	public static int maxProfit(int[] prices) {
		//mP is the counter for the max possibe profit
		int mP = 0;
		
		//iterate through the index's in the array
		for(int i = 1; i < prices.length ; i++) {
			
			//If prices[i] - prices[i-1] >= 0 than there is profit to be made there, therefore add it to the mP counter and continue looping
			//Otherwise ignore it and continue to the next index.
			if(prices[i] - prices[i-1] >= 0 ) {
				mP += prices[i]-prices[i-1];
			}
		}
		
		
		return mP;
    }
	
	
}
