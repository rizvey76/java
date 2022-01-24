package com.test.thread;

class Product{
	int product;
	
	boolean valueSet=false;
	
	
	
	public synchronized void put(int product) {
		
		while(valueSet) {
			
			try {
				wait();
				
			}catch(Exception e) {
				
			}
			
		}
		
		
		this.product=product;
		System.out.println("Put Product :"+product);
		
		valueSet=true;
		notify();
	}
	
	
	public  synchronized void get() {
		
		while(!valueSet) {
			
			try {
				wait();
				
			}catch(Exception e) {
				
			}
			
		}
		
		System.out.println("Get Product :"+product);
		valueSet=false;
		notify();
	}
}







class Producer implements Runnable{
   Product p;
	
   
   public Producer(Product p) {
	   this.p=p;
	   Thread t1=new Thread(this,"Producer");
	   t1.start();
   }
   
   
	@Override
	public void run() {
		int i=0;
		
		
		while(true) {
			p.put(i++);
			
			try {
				Thread.sleep(100);
				
			}catch(Exception e) {
				
			}
		}
			
	
		
	}
	
}


class Consumer implements Runnable{
	Product p;
	
	public Consumer(Product p) {
		this.p=p;
		   Thread t2=new Thread(this,"Consumer");
		   t2.start();
		
	}
	
	@Override
	public void run() {
	
		
		
		while(true) {
			p.get();
			
			try {
				Thread.sleep(100);
				
			}catch(Exception e) {
				
			}
		}
	}
	
}





public class ThreadEx7 {
	
	public static void main(String[] args) {
		
		Product p=new Product();
		
		new Producer(p);
		new Consumer(p);
		
	}

}
