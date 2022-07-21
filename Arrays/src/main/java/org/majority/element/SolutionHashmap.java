package org.majority.element;

import java.util.HashMap;

public class SolutionHashmap {

    public static int findMajorityElement(int[] input ){
        HashMap<Integer, Integer> hashOfInput = new HashMap<Integer, Integer>();

        for(int pointer1: input){
            int counter = 0;
            for(int pointer2: input){
                if(pointer2 == pointer1){
                    counter+=1;
                }}
            hashOfInput.put(pointer1, counter);
        }


        return -1;
    }

    public static void  main(String[] args){

        int[] inputArray = {01,1,2,3,3,4,4,4,5,6,3,1,2};
        System.out.println("Hello World ::" +findMajorityElement(inputArray));

    }
}
