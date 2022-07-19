package org.majority.element;

public class SolutionBruteforce {

    public static int majorityElement(int[] input){

        for(int pointer1: input){
            int counter =0;
            for(int pointer2: input){
                if(pointer2 == pointer1){
                    counter+=1;
                }

            }
            if (counter > input.length/2){
                return pointer1;
            }
        }

return -1;
    }

public static void main (String[] args){
        int[] sampleInput = {0,1,2,3,4,5,5,5,5,5,5,5,5,55,5};

        System.out.println("Hello World ::" + majorityElement(sampleInput));
}

}
