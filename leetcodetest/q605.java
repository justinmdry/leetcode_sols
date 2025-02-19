package leetcodetest;

public class q605 {

	public static void main(String args[]) {
		int[] flowerbed = {1,0,0,0,0,0};
		int n = 3;
		
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
	
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int counter = 0;
	        
	        if(n ==0) {
	        	return true;
	        }else if(flowerbed.length == 1) {
	        	return(n == 1 && flowerbed[0] == 0);
	        }

	        for(int i = 0 ; i < flowerbed.length ; i++){
	            if(flowerbed[i] == 0){
	                if(i+1 == flowerbed.length){
	                    if(flowerbed[i-1] ==  0){
	                        flowerbed[i] = 1;
	                        counter++;
	                    }
	                }else if(i-1 < 0){
	                    if(flowerbed[i+1] ==  0){
	                        flowerbed[i] = 1;
	                        counter++;
	                    }
	                }else if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
	                    flowerbed[i] = 1;
	                    counter++;
	                }

	            }
	        }
	        return(counter >= n);
	    }
}
