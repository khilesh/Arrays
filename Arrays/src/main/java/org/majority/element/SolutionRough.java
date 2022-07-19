package org.majority.element;

public class SolutionRough {

public static int majorityElement(int[] nums){
    int majorityCount = nums.length/2;

    for (int num: nums){
        int count =0;
        for (int elem: nums){
            if (elem == num){
                count +=1;
            }
        }
        if (count >= majorityCount){
return num;
    }

}
    return -1;}

    public static void main (String[] args){

        int input1[] = {0, 3, 5, 6, 8, 3, 4};
        int input2[] = {0, 3, 5, 6, 3, 3, 4};
        int input3[] = {0, 3, 5, 6, 3, 3, 4,6};
        int input4[] = {3, 3, 3, 3, 6, 6, 6,6};


     System.out.println("Hello world 1: " + majorityElement(input1) );
        System.out.println("Hello world 2: " + majorityElement(input2) );
        System.out.println("Hello world 3: " + majorityElement(input3) );
        System.out.println("Hello world 4: " + majorityElement(input4) );

    }


/******
    public int[] findMajorityElement(int [] inputArray){

        //base conditions: Size of input array is 0 or 1 or 2

        // 1. initialize left & right pointers and occurence of majority element as 0;
        // 2. Get length of input array/
        // 3. Start iterating array from left - for loop
        // 4. Increment right pointer as left +1
        // 5. Check for the value of element at left 0th index, increment for every find.
        // 6. Return occurence of majority element.

        int maxOccurence =0;

        for (int left =0; left < inputArray.length; left++){
             for (int right = left +1; right < inputArray.length; right++){
                 if (inputArray[left] == inputArray[right] ) {
                     maxOccurence++;
                 }
             }
        }

        return new int[]{maxOccurence};
    }


 ****/
}
/***
 * Brute force solution (Approach 1 ) is incorrect as it does not takes into consideration the scenario wherein multiple numbers (from the given input Array) are majority elements. For e.g below input array. int input4[] = {3, 3, 3, 3, 6, 6, 6,6};
 */