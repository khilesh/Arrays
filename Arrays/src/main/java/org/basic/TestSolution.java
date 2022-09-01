package org.basic;

public class TestSolution {

public static void main(String [] args){
	
	System.out.println("Hello World");
	
	int[] inputArray1 = {12,345,2,6,7896};
	int[] inputArray2 = {555,901,482,1771};
	int[] inputArray3 = {1,1,0,1,1,1};
	
	int toFind = 1;
	
	System.out.println("Hello World 1:: " + findNumbers(inputArray1));
	System.out.println("Hello World 2:: " + findNumbers(inputArray2));
	System.out.println("Hello World 3:: " + findNumbers(inputArray3 ));
	
}

public static int findNumbers(int[] nums) {
	int res = 0;
	for(int i = 0;i<nums.length;i++){
		if(Integer.toString(nums[i]).length()%2 == 0){
			res++;
		}
	}
	return res;
}
}
