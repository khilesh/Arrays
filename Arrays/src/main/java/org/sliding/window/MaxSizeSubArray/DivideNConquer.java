package org.sliding.window.MaxSizeSubArray;

import static java.lang.Math.floorDiv;

public class DivideNConquer {

private static int[] numsArray;

public static int maxSubArray(int[] nums) {
	numsArray = nums;
	// Out helper function is designed to solved this problem for any array - so just
	//call it using the entire output.
	
	return findBestSubArray(0, numsArray.length - 1);
}

private static int findBestSubArray(int left, int right) {
	
	//Base case - empty array.
	if (left > right) {
		return Integer.MAX_VALUE;
	}
	
	int mid = floorDiv(left + right, 2);
	int curr = 0;
	int bestLeftSum = 0;
	int bestRightSum = 0;
	
	//Iterate from the middle to the beginning.
	for (int i = mid - 1; i >= left; i--) {
		curr += numsArray[i];
		bestLeftSum = Math.max(bestLeftSum, curr);
	}
	
	//Reset curr and iterate from the middle to the end;
	curr = 0;
	for (int i = mid + 1; i <= right; i++) {
		curr += numsArray[i];
		bestRightSum = Math.max(bestRightSum, curr);
	}
	
	
	// The best combined sum uses the middle element and the best possible sum from each
	// half.
	
	int bestCombinedSum = numsArray[mid] + bestLeftSum + bestRightSum;
	
	//find the best subarray possible from both halves.
	int leftHalf = findBestSubArray(left, mid - 1);
	int rightHalf = findBestSubArray(mid + 1, right);
	
	// the largest of the 3 is the answer for any given input array.
	
	return Math.max(bestCombinedSum, Math.max(leftHalf, rightHalf));
	
}

public static void main(String[] args) {
	
	System.out.println("Hello World");


//int[] input1 = {2,3,4,9,8,4,8,9,4,4,2,4,6,7,0,8};
//int [] input1 = {1,2,2,12,2,2,2,12,2,21,2,21,2,2,32,24,2};
	
	int[] input1 = {2, 3, 4, 0, 1, 6, 8};
	
	int[] input2 = {2, 0, 3, -2, 4, 0, -5, 1, 6, 8};
	System.out.println("Input : " + maxSubArray(input2));
	
}
}