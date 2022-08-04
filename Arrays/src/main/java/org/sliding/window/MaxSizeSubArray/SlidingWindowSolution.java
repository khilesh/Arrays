package org.sliding.window.MaxSizeSubArray;

public class SlidingWindowSolution {


public static int getMaxSumUsingSlidingWindowTechnique(int[] inputArray, int k){
	
	int maxSum = 0;
	int windowSum = 0;
	for(int i = 0; i< k; i++){
		windowSum += inputArray[i];
	}
	
	for(int end =k; end < inputArray.length; end++){
		windowSum += inputArray[end] - inputArray[end -k];
		maxSum = Math.max(maxSum, windowSum);
	}
	return  maxSum;
}

public static void main (String[] args){
	
	System.out.println("Hello World");
	
	//int[] input1 = {2,3,4,9,8,4,8,9,4,4,2,4,6,7,0,8};
	//int [] input1 = {1,2,2,12,2,2,2,12,2,21,2,21,2,2,32,24,2};
	
	int [] input1 = {2, 3, 4, 0, 1, 6, 8};
	System.out.println("Input 1: " +getMaxSumUsingSlidingWindowTechnique(input1,4));
}
}
