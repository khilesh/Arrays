package org.majority.element;

public class SolutionBoyerMoore {

public static int majorityElement(int[] nums) {
	int count = 0;
	Integer candidate = null;
	
	for (int num : nums) {
		if (count == 0) {
			candidate = num;
		}
		count += (num == candidate) ? 1 : -1;
	}
	
	return candidate;
}

public static void main(String[] args) {
	
	System.out.println("Hello world ");
	
	int[] input1 = {1, 2, 3, 4, 5, 5, 6, 5};
	int[] input2 = {1, 2, 3 };
	System.out.println("Hello world Input1 ::  " + majorityElement(input1));
	System.out.println("Hello world Input2 ::  " + majorityElement(input2));
	
}
}
