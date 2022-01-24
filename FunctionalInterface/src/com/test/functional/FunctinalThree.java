package com.test.functional;

import java.util.function.Function;

public class FunctinalThree {
	public static void main(String[] args) {
		Function<Integer,String> function=(intValue)->intValue*2+""+"Is the resulting value by Multiplying 2";
		                                   ///Function Interface can perform both input and output
		String result=function.apply(2);
		
		System.out.println(result);
		
	}

}
