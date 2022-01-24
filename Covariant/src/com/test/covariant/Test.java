package com.test.covariant;

class A{
	
	Object sum() {
		return new A() ;
	}
	
}


class B extends A{
	@Override
	String sum() {        ///return type change the method of Super class in Subclass
		return "hello";
	}
	
}

public class Test {
	public static void main(String [] args) {
		B b=new B();
		System.out.println(b.sum());
		
	}
     
	
	

}
