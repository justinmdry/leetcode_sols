package leetcodetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q1431 {

	
	 public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        List<Boolean> rtn = new ArrayList<Boolean>();

	        int cur_max = Arrays.stream(candies).max().getAsInt();

	        for(int i = 0 ; i < candies.length ; i++){
	            if(candies[i] + extraCandies >= cur_max){
	                rtn.add(true);
	            }else{
	                rtn.add(false);
	            }
	        }

	        return rtn;
	    }
}
