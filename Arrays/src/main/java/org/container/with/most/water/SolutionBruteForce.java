package org.container.with.most.water;

public class SolutionBruteForce {

    public static int maxWater(int [] height){
        // intialize max to 0;
        // a for loop for start pointer
        // a for loop for end pointer
        // calculate area
        // update max Area
        // return max
        int max = 0;


        for (int left =0; left < height.length; left++){
            for (int right = left+1; right< height.length;right++){
                int area = Math.min(height[left],height[right] ) * (right-left);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    public static void main (String [] args){
        System.out.println("Hello World");

        int input1[] = {1,8,6,2,5,4,8,3,7};

        int input2[] = {1,1};

        System.out.println("Hello World Solution" + maxWater(input1));

    }

}
