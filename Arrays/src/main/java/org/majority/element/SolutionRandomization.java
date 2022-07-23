package org.majority.element;

import java.util.Arrays;
import java.util.Random;

public class SolutionRandomization {
private static int randRange(Random rand, int min, int max) {
	return rand.nextInt(max - min);
}

private static int countOccurences(int[] nums, int num) {
	int count = 0;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == num) {
			count++;
		}
	}
	return count;
}

public static int majorityElement(int[] nums) {
	Random rand = new Random();
	int majorityCount = nums.length / 2;
	
	while (true) {
		int candidate = nums[randRange(rand, 0, nums.length)];
		if (countOccurences(nums, candidate) > majorityCount) {
			return candidate;
		}
		
	}
}

public static void main(String[] args) {
	
	System.out.println("Hello World");
	int[] input1 = {1, 2, 3, 4, 5, 5, 6, 5};
	System.out.println("Hello World ::" + majorityElement(input1));
}

}
