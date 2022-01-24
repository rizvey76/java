package com.method.reference;

public class CallMethodByLambda1 {
	
	public static void main(String[] args) {
		
		Thread myThread=new Thread( ()->

		
				
				printMessage()		///ByLambda Expression
	);
		
		
		myThread.start();
	}


	public static void printMessage() {
		System.out.println("Hello World!");
	}

}
