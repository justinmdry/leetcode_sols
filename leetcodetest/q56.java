package leetcodetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Digusting vile question that needs to be executed

public class q56 {
	 public static void main(String args[]) {
		 int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
		 
		 intervals = merge(intervals);
	 }
	 
	 public static int[][] merge(int[][] intervals){
		 
		 List<Integer> tmp = new ArrayList<>();
		 
		 
		 int left = 0;
		 int right = intervals.length;
		 
		 while(left < right) {
			 if(intervals[left][1] < intervals[right][0]) {
				 right--;
			 }else {
				 tmp.add(intervals[left][0]);
				 tmp.add(intervals[right][1]);
			 }
		 }
		 
		 int[][] rtn = new int[tmp.size()/2][2];
		 
		 for(int i = 0 ; i < tmp.size() ; i+=2) {
			 rtn[i/2][0] = tmp.get(i);
			 rtn[i/2][1] = tmp.get(i+1);
		 }
		 
		 return rtn;
	 }
}
