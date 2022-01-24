package com.test.generics2;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	
	
	static double sumOfNumberlist(List<? extends Number> list) {   ///By "?" wildcard symbol
		double sum=0.0;
		
		for(Number number:list) {
			sum+=number.doubleValue();
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList <Double> list=new ArrayList<>(List.of(10.00,8.00,7.000));
		System.out.println( sumOfNumberlist(list));
		
		
		ArrayList <Integer> intList=new ArrayList<>(List.of(10,8,7));
		System.out.println( sumOfNumberlist(intList));
	}

}
