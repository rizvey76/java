package com.test.generics1;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {
	
	static<X extends List> void addData(X list) { //Type in method
		list.addAll(list);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<>(List.of(1,5,9));
		addData(numbers);
		
		System.out.println(numbers);
		
	}

}
