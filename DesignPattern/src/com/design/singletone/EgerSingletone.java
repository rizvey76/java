package com.design.singletone;


class SingleTone{
	
	static SingleTone obj=new SingleTone(); ///bulky instance
	
	private SingleTone() {
		
	}
	
	public static SingleTone getObject() { ////Eagerly Singletone
		return obj;
	}
}



public class EgerSingletone {
	public static void main(String[] args) {
		
		SingleTone obj1= SingleTone.getObject();
		
		SingleTone obj2= SingleTone.getObject();
		
		
		System.out.println(obj1); //Same obj print
		System.out.println(obj2); //Same obj print
	}

}
