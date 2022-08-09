package org.maxNumberOfKSumPairs;

import java.util.HashMap;

public class HashMapSinglePass
{

public static int findMaxSum(int[] nums, int k) {
	HashMap<Integer, Integer> map = new HashMap<>();
	int count = 0;
	for (int i = 0; i < nums.length; i++) {
		int current = nums[i];
		int complement = k - current;
		if (map.getOrDefault(complement, 0) > 0) {
			// remove complement from the map
			map.put(complement, map.get(complement) - 1);
			count++;
		} else {
			// add current element in the map
			map.put(current, map.getOrDefault(current, 0) + 1);
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
