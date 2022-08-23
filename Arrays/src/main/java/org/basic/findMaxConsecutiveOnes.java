package org.basic;


public class findMaxConsecutiveOnes {

/****
 * Problem Statement: Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * @param args
 */


public static void main(String[] args) {

	int[] inputArray1 = {2,3,4,5,6,1,1,1,1,1,1,1,1,1,1};
	int[] inputArray2 = {1,0,1,1,0,1};
	int[] inputArray3 = {1,1,0,1,1,1};
	
	int toFind = 1;
	
	System.out.println("Hello World 1:: " + findMaxConsecutiveOnes(inputArray1,toFind ));
	System.out.println("Hello World 2:: " + findMaxConsecutiveOnes(inputArray2,toFind ));
	System.out.println("Hello World 3:: " + findMaxConsecutiveOnes(inputArray3,5 ));
	
}

/**
 * Input: {2,3,4,5,6,1,1,1,1,1,1,1,1,1,1} Output: 10
 * Input: {1,0,1,1,0,1} output: 2
 * Input: {1,1,0,1,1,1} output:3
 */

public static int findMaxConsecutiveOnes(int[] nums, int k) {
	
	
	/******** ALWAYS DO --- START ****/
	int counter = 0;
	int maxCount = 0;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == k) {
			counter++;
		} else {
			if (counter > maxCount) {
				maxCount = counter;
			}
		counter = 0;
	}
}
		return Math.max(counter, maxCount);
		
	}
/******** ALWAYS DO --- END ****/
}



