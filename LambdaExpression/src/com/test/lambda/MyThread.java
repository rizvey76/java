package com.test.lambda;

public class MyThread {
	public static void main(String[] args) {
		Thread customThread=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Custor thread working!");
			}
			
		});
		
		customThread.run();
		
		
		
		//////Thread using Lambda expression
		
		Thread customThread1=new Thread(
				
				()-> System.out.println("Custom thread with lambda Expression!")
				
				);
		
		customThread1.run();
	}

}
