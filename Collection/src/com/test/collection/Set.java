package com.test.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {
	
	
	
	public static void main(String[] args) {
//		HashSet<String> hset=new HashSet<>(); ///It does not maintain order
		
		TreeSet<String> hset=new TreeSet<>(); ///It maintain ascending order
		
		hset.add("John");
		hset.add("Jock");
		hset.add("Tom");
		hset.add("Aiman");
		
		System.out.println(hset);
	}
	

}
