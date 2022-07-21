package org.majority.element;

import java.util.Arrays;

public class SolutionSort {

    public static int majorityElement(int [] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args){
        System.out.println("Hello World");

        int[] input1 = {1,2,3,4,5,5,6,5};
        System.out.println("Hello world2 ::  " + majorityElement(input1) );
    }
}
