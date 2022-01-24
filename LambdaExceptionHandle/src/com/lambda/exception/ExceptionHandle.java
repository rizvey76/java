package com.lambda.exception;

import java.util.function.BiConsumer;

public class ExceptionHandle {
	
	public static void main(String[] args) {
		int [] arr= {2,8,9,7};
		
		int key=0;
		
		
		process(arr,key,(v,k)-> {
		
		try {
			System.out.println(v/k);      /////////Lambda expression with try catch
			
		}catch(ArithmeticException e) {
			
			System.out.println("Result id undefine due to exception");
		}
		
		}
		
		);
	}
	
	
	
	
	
	
	
	
	
	public static void process(int [] arr,int key,BiConsumer<Integer,Integer> consumer) {
		for(int i:arr) {
			consumer.accept(i,key);
		}
	}
	
	
	

}
