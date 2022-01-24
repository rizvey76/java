package com.test.thread;


class FirstTheard extends Thread{
	 @Override
	public void run() {
		 
		 for(int i=1; i<=5; i++) {
			System.out.println("FirstThread #"+i); 
			
			try {
				Thread.sleep(500);  //Suspend Normal work of Thread
				
			}catch(Exception e) {
				
			}
		 }
		
	}
	
	
}


class SecondThread extends Thread{
	 @Override
	public void run() {
		 for(int i=1; i<=5; i++) {
				System.out.println("SecondThread #"+i); 
				
				try {
					Thread.sleep(500);
					
				}catch(Exception e) {
					
				}
			 }
	}
	
	
}


public class ThreadEx1 {
	
	public static void main(String[] args) {
		System.out.println("This is main thread"); 
		
		
		FirstTheard f1=new FirstTheard();
		f1.start();
		
		SecondThread f2=new SecondThread();
		f2.start();
		
		try {
			Thread.sleep(10);  ///Delay Between Thread
			
		}catch(Exception e) {
			
		}
		
	}

}
