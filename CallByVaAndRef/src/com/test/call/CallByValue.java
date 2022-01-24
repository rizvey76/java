package com.test.call;



public class CallByValue {
	
	public static void changeValue(int input) {
		input=50;
	}
	
	public static void main(String[] args) {
	int val1=20;
	
	changeValue(val1);
	
	System.out.println(val1);
	}

}
