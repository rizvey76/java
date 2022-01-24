package com.test.functional;

import java.util.function.Supplier;

public class FunctionalFour {
	public static void main(String[] args) {
		Supplier<Double> randomValue=()-> Math.random(); ///Supplier Interface only can output  
		
		double value=randomValue.get();
		
		System.out.println(value);
	}

}
