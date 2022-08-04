package org.sliding.window.MaxSizeSubArray;

/*****
 *
 */

public class BruteSolution {


public static int getMaxSumSubArrayOfSizek(int[] arr, int k) {
	
	int maxSum = 0;
	
	for(int i=0; i<= arr.length -k; i++){
		int windowSum = 0;
		 for (int j = i; j < i +k ;j++){
			 windowSum += arr[j];
		 }
		 maxSum = Math.max(windowSum, maxSum);
	}
	return  maxSum;

}


public static void main (String[] args){
	
	System.out.println("Hello World") ;
	
	int [] input1 = {1,2,2,12,2,2,2,12,2,21,2,21,2,2,32,24,2};
	System.out.println("input1 ::" + getMaxSumSubArrayOfSizek(input1, 4)) ;
	
}
}
