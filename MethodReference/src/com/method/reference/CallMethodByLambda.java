package com.method.reference;

public class CallMethodByLambda {
	
	
public static void main(String[] args) {
	
	Thread myThread=new Thread(new Runnable() {

		@Override
		public void run() {      ////Without Lambda Expression
			// TODO Auto-generated method stub
			printMessage();
		}
		
		
	});
	
	myThread.start();
}


public static void printMessage() {
	System.out.println("Hello World!");
}


}
