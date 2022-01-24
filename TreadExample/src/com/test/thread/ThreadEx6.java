package com.test.thread;

class Count{
	int count;
	
	public synchronized void increment() {
		count++;
	}
}

public class ThreadEx6 {
	public static void main(String[] args) {
		Count c=new Count();
		
		Thread t1=new Thread(
				new Runnable() {

					@Override
					public void run() {
					  for(int i=1;i<=100;i++) {
						  c.increment();
						  
					  }
						
					}
					
				}
				
				);
		
		t1.start();
		try {
			t1.join();
			
		}catch(Exception e) {
			
		}
		
		
		Thread t2=new Thread(
				new Runnable() {

					@Override
					public void run() {
					  for(int i=1;i<=100;i++) {
						  c.increment();
						  
					  }
						
					}
					
				}
				
				
				);
		t2.start();
		try {
			t2.join();
			
		}catch(Exception e) {
			
		}
		
		
		System.out.println("value ="+ c.count);
		
	}

}
