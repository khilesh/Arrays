package org.sliding.window.MaxSizeSubArray;

public class KadanesAlgoSolution {

public static int maxSubArray(int [] inputArray){

	//Initializing variables using first element.
	int currentSubArray = inputArray[0];
	int maxSubArray = inputArray[0];
	
	// Starting with the 2nd element since we already used the first one.
	for(int i =1; i< inputArray.length;i++){
		int tempNum = inputArray[i];
		
		// if current subarray is negative, throw it away; otherwise keep adding to it.
		
		currentSubArray = Math.max(tempNum, currentSubArray + tempNum);
		maxSubArray = Math.max(maxSubArray, currentSubArray);
	}
	
	return maxSubArray;
}


public static void main(String [] args){
	
	System.out.println("Hello World");
	
	//int[] input1 = {2,3,4,9,8,4,8,9,4,4,2,4,6,7,0,8};
	//int [] input1 = {1,2,2,12,2,2,2,12,2,21,2,21,2,2,32,24,2};
	
	int [] input1 = {2, 3, 4, 0, 1, 6, 8};
	
	int [] input2 = {2, 0, 3, -2, 4, 0, -5, 1, 6, 8};
	System.out.println("Input 1: " +maxSubArray(input2));
	
}

}
