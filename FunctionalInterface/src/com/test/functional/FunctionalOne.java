package com.test.functional;

import java.util.function.Predicate;

public class FunctionalOne {

	public static void main(String[] args) {
		Predicate<String> pr=(String name)-> name.length()>4; ///Predicate interface just test data and send boolean
		
		System.out.println(pr.test("Aiman"));
	}
}
