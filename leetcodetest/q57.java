package leetcodetest;

import java.util.ArrayList;
import java.util.List;

public class q57 {

	public static void main(String args[]) {
		int[][] test= {{1,2},{3,5},{6,7},{8,10},{12,16}};
		
		int[] test2 = {4,8};
		
		int[][] res = insert(test, test2);
		
		for(int i = 0 ; i < res.length ; i++) {
			for(int j = 0 ; j < res.length ; j++) {
				System.out.println(res[i][j]);
			}
		}
	}
	
	public static int[][] insert(int[][] intervals, int[] newInterval){
		
		//New list to store the solution
        List<int[]> solved = new ArrayList<>();
        //Used to iterate through intervals 
        int i = 0;

        //Add the intervals that wont be affected by the new interval to solved
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            solved.add(intervals[i]);
            i++;
        }

        //Adjust the new interval to account for the previous intervals range's
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        //Add the new interval to solved
        solved.add(newInterval);

        //Add remaining intervals 
        while(i < intervals.length){
            solved.add(intervals[i]);
            i++;
        }
        //Return solved as a 2d array 
        return solved.toArray(new int[solved.size()][]);
		
	}
}
