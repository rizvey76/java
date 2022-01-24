package com.design.singletone;

class LazySingleTone{
	
static LazySingleTone obj;
	
private LazySingleTone() {
		System.out.println("Instance Created");
	}

public static synchronized LazySingleTone getObject() {   ///by using  synchronized keyword we can achieve Thread safe
	
	if(obj==null) {
		obj=new LazySingleTone();
		
		
	}
	return obj;
	
}
	
}





public class LazyInitialization {
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				LazySingleTone obj1= LazySingleTone.getObject();
				
			}
			
		}
				);
		
		t1.start();
		
		
		
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				LazySingleTone obj2= LazySingleTone.getObject();
				
			}
			
		}
				);
		
		t2.start();
		
		
		
		
		
		
		
		
		
	
	}

}
