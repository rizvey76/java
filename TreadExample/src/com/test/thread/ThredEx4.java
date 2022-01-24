package com.test.thread;

public class ThredEx4 {
	public static void main(String[] args) {
		
		
Runnable obj1=()->{
			
			for(int i=1; i<=10;i++) {
				System.out.println("Hi");
				
				
				try {
					Thread.sleep(100);
					
				}catch(Exception e) {
					
				}
			}
		
			
		
			
		};
		
        Runnable obj2=()->{
        	for(int i=1; i<=10;i++) {
				System.out.println("Hello");
				
				try {
					   Thread.sleep(100);
						
					}catch(Exception e) {
						
					}
			}
        	
    
			
		};
		
		
		Thread t1= new Thread(obj1);
		t1.start();
		Thread t2= new Thread(obj2);
		
	
		
		t2.start();
		
		
		try {
			Thread.sleep(10);
			
			t1.join();      ///By using join() method this two thread will run before main thread
			t2.join();
			
		}catch(Exception e) {
			
		}
		
		System.out.println("By There"); 
		
		
	}

}
