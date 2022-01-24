package com.lambda.exception;

import java.util.function.BiConsumer;

public class ExceptionHandleWrapper {

	public static void main(String[] args) {
		int [] arr= {2,8,9,7};
		
		int key=0;
		
		
		process(arr,key,wapperLambda((v,k)-> System.out.println(v/k)));  ///Since wrapper lambda method's return type is  BiConsumer<Integer,Integer>
	}
		
		
			    
			
	
	public static void process(int [] arr,int key,BiConsumer<Integer,Integer> consumer) {
		for(int i:arr) {
			consumer.accept(i,key);
		}
	}
	
	
	
	public static BiConsumer<Integer,Integer> wapperLambda(BiConsumer<Integer,Integer> consumer){
		return (v,k)-> {
			
			try {
				consumer.accept(v, k);
				
			}catch(ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda");
			}
			
		};
		
		
		
	}
	
	
}
