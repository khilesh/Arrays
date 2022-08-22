package org.maxNumberOfKSumPairs;

import java.util.Arrays;

public class TwoPointerMinusAfterSort {


public static int getSubstractK(int [] inputArray, int k){
	
	Arrays.sort(inputArray);
	
	int left = 0;
	int right = inputArray.length -1;
	int count= 0;
	
	while (left < right){
		if(inputArray[right] - inputArray[left] < k){
			left ++;
		} else if (inputArray[right] - inputArray[left] > k) {
			right --;
		} else {
			count++;
			left++;
			right--;
		}
	}
return count;
}

public static void main(String [] args){
	
	//int [] sampleInput1 = {1,3,2,4,4,5,}; //5,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput2 = {3,2,0,5}; //5,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput3 = {1,3,2,4,4,5,3}; //5,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput4 = {1,3,2,4,4,5,35,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput5 = {3,1,3,4,3};
	int [] sampleInput6 = {3,2,1,1,4,0};
	
	//int outputSum = 8;
	//int outputSum5 = 6;
	int outputMinus6 = 2;
	
	//System.out.println("Hello World1: " + findMaxSum(sampleInput1, outputSum));
	//System.out.println("Hello World2: " + findMaxSum(sampleInput2, outputSum));
	//System.out.println("Hello World3: " + findMaxSum(sampleInput3, outputSum));
	//System.out.println("Hello World4: " + findMaxSum(sampleInput4, outputSum));
	//System.out.println("Hello World5: " + findMaxSum(sampleInput5, outputSum5));
	System.out.println("Hello World6: " + getSubstractK(sampleInput6, outputMinus6));
}
}