package org.dynamic.programming.scaler;

public class AddSum {



public static void main(String args []){
	
	System.out.println("Hellow world ::::" + calculateSum(3));
}

public static int calculateSum(int input){
	if(input ==1){
		return 1;
	}
	return calculateSum(input -1) +input;
}
}
