package leetcodetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q452 {

	public static void main(String args[]) {
		int[][] points = {{}};
		
		System.out.println(findMinArrowShots(points));
	}
	
	public static int findMinArrowShots(int[][] points) {
		
		//Sort the list
		Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
		//Arrows counter
		int arrows = 1;
		//Used to store the previous end point
		int prevEnd = points[0][1];
		
		//Iterate through points
		for(int i = 1 ; i < points.length ; i++) {
			//If the balloons intersect
			if(points[i][0] <= prevEnd) {
				//Then continue
				continue;
			}else {
				//Otherwise fire a new arrow 
				arrows++;
				//Update the endpoint to check where your firing your next arrow
				prevEnd = points[i][1];
			}
		}
        //Return arrows
		return arrows;
	}
}
