package org.maxNumberOfKSumPairs;

import java.util.Arrays;

public class TwoPointerAfterSort {


public static int findMaxSum(int[] inputArray, int k){
	
	Arrays.sort(inputArray);
	int count =0;
	int left = 0;
	int right = inputArray.length - 1;
	
	while(left< right){
		if(inputArray[left] + inputArray[right] < k){
			left++;
		} else if (inputArray[left] + inputArray[right] > k) {
			right --;
		} else {
			left++;
			right--;
			count++;
		}
		
	}
	
	
	return count;
}

public static void main(String [] args){
	
	//int [] sampleInput1 = {1,3,2,4,4,5,}; //5,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	int [] sampleInput2 = {3,2,0,5}; //5,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput3 = {1,3,2,4,4,5,3}; //5,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput4 = {1,3,2,4,4,5,35,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput5 = {3,1,3,4,3};
	
	int outputSum = 8;
	int outputSum5 = 6;
	
	//System.out.println("Hello World1: " + findMaxSum(sampleInput1, outputSum));
	System.out.println("Hello World2: " + findMaxSum(sampleInput2, outputSum));
	//System.out.println("Hello World3: " + findMaxSum(sampleInput3, outputSum));
	//System.out.println("Hello World4: " + findMaxSum(sampleInput4, outputSum));
	//System.out.println("Hello World5: " + findMaxSum(sampleInput5, outputSum5));
}
}
