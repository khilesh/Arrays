package org.majority.element;

public class KadanesAlgorithm {

/*** Problem Statement:
 * To find the sum of the contiguous subarray within a one-dimensional array of numbers
 * that has the largest sum.
 */

public static void main(String[] args){
	
	int [] inputArrray = {-2, -3, 4, -1, -2, 1, 5, -3};
	
	System.out.println("Hello World Input: " + inputArrray) ;
	
	System.out.println("Maximum contiguous sum is " + maxSubArraySum(inputArrray));
}


static int maxSubArraySum(int input[]){
	
	//int size = input.length;
	int max_so_far =Integer.MIN_VALUE;
	int max_ending_here = 0;
	for(int i=0; i< input.length; i++){
		max_ending_here = max_ending_here + input[i];
		if(max_so_far < max_ending_here)
			max_so_far = max_ending_here;
		
		if(max_ending_here < 0)
			max_ending_here = 0; }
	return  max_so_far;
	}
	
}


