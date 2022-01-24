package com.test.thread;

class FirstTheard1 implements Runnable{   ///Using Runnable Interface
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


class SecondThread1 implements Runnable{
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



public class ThreadEx2 {
	
	public static void main(String[] args) {
		System.out.println("This is main thread"); 
		
		
		Runnable f1=new FirstTheard1();
		
		Thread t1=new Thread(f1);
		t1.start();
		
	
		
	   Runnable f2=new SecondThread();
		
		Thread t2=new Thread(f2);
		t2.start();
		
		try {
			Thread.sleep(10);  ///Delay Between Thread
			
		}catch(Exception e) {
			
		}
		
	}

}
