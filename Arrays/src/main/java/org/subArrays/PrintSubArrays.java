package org.subArrays;

public class PrintSubArrays {


static int subArrays(int[] input){
	int counter =0;
	
	for (int i =0 ; i< input.length; i++){ //left index
		for (int j= i; j< input.length; j++) {// right index
			 for (int k =i; k<= j; k++){
				 System.out.println("SubArrays " +"i :"+i + " k :" + k  + " "+ input[k]);
				 counter ++;
			 }
		}
	}
	
	System.out.println("Counter " + counter );
	
	return -1;
}


public static void main(String [] args){
	
	System.out.println("Hello World");
	//int [] sampleInput1 = {1,3,2,4,4,5,}; //5,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput2 = {3,2,0,5}; //5,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	int [] sampleInput3 = {1,3,2,4,4,5,3,5,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput4 = {1,3,2,4,4,5,35,6,7,8,3,45,0,5,2,3,2,2,7,8,9,3,2,2,2};
	//int [] sampleInput5 = {3,1,3,4,3};
	
	
	
	//System.out.println("Hello World1: " + subArrays(sampleInput1));
	//System.out.println("Hello World2: " + subArrays(sampleInput2));
	System.out.println("Hello World3: " + subArrays(sampleInput3));
	//System.out.println("Hello World4: " + subArrays(sampleInput4));
	//System.out.println("Hello World5: " + subArrays(sampleInput5));
}
}
