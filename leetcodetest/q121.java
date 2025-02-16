package leetcodetest;

public class q121 {
	public static void main (String[] args) {
		int prices[] = {7,6,4,3,1};
		
		int k = maxProfit(prices);
		
		System.out.println(k);
		
	}
	
	    public static int maxProfit(int[] prices) {
	        
	       //mP is used to store the max profit
	        int mP = 0;
	        
	        //This is used to maintain the lowest number position
	        int low  = prices[0];
	        
	        for(int i = 1 ; i < prices.length ; i++) {
	        	if(low < prices[i]) {
	        		//If the low is still the low
	        		//Make tmp which is  a temporary variable for the possible max profit
	        		int tmp = prices[i]-low;
	        		
	        		//If tmp is the new max profit
	        		if(tmp >= mP) {
	    	        	//Replace mP with the value stored at tmp
	        			mP = tmp;
	        		}
	        		
	        	}else{
	        		//Otherwise make low the new lowest value
	        		low = prices[i];
	        	}
	        }

	        
	        
	        return mP;
	        
	        //Sol 2, did not pass every test case
//	        int low  = 100;
//	        int high = 0;
//	        int mP = 0;
//
//	        for(int i = 0 ; i < prices.length ; i++) {
//	        	
//	        	mP = high-low;
//	        	
//	        	if(prices[i] > high) {
//	        		high = prices[i];
//	        		if(mP < high-low) {
//	        			mP = high-low;
//	        		}
//	        	}
//	        	
//	        	if(prices[i] < low) {
//	        		low = prices[i];
//	        		high = 0;
//	        	}
//	        	
//	        	
//	        }
//	        System.out.println(low);
//	        System.out.println(high);
//	        
//	        if(high == 0) {
//	        	return 0;
//	        }else {
//	        	return mP;
//	        }
	    }
}
