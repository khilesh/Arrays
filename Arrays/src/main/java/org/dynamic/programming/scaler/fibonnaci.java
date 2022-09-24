package org.dynamic.programming.scaler;

public class fibonnaci {

public static void main(String args []){
	
	System.out.println("Hellow world ::::" + calculatefib(7));
}
public static int calculatefib(int input){
	if(input ==0 || input ==1){
		return input;
	}
	return calculatefib(input -1) + calculatefib(input -2);
}
}

