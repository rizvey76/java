package com.method.reference;

public class CallMethodUsingMethodRef {
	
public static void main(String[] args) {
		
		Thread myThread=new Thread(CallMethodUsingMethodRef :: printMessage);    ///By Method Reference, since printMessage() is static method
		
		
		myThread.start();
	}


	public static void printMessage() {
		System.out.println("Hello World!");
	}


}
