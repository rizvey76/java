package com.recursive.method;

public class RecursiveMethod {
	
	public int sum(int a) {
	
		
		
		if(a>0) {
		    a=a+sum(a-1);
			return a;
			
		}else {
			return 0;
		}

	}
	
	public static void main(String [] args) {
		System.out.println(new RecursiveMethod().sum(10));
	}

}
