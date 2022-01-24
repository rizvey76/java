package com.design.singletone;


class DoubleChecked{
	static DoubleChecked obj;
	
	private DoubleChecked() {
			System.out.println("Instance Created");
		}

	public static DoubleChecked getObject() {
		
		if(obj==null) {
			
			synchronized(DoubleChecked.class) {     ///Double Checked Locking
				if(obj==null) {
					obj=new DoubleChecked();
				}
			}
			
			
			
		}
		return obj;
		
	}
}



public class DoubleCheckedLock {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				DoubleChecked obj1= DoubleChecked.getObject();
				
			}
			
		}
				);
		
		t1.start();
		
		
		
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				DoubleChecked obj2= DoubleChecked.getObject();
				
			}
			
		}
				);
		
		t2.start();
	}

}
