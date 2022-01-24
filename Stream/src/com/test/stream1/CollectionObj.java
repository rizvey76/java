package com.test.stream1;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionObj {   ///By Using Filter
	
	public static void main(String[] args) {
		List<Integer> listInt=List.of(4,8,9,7,11);
		
		
		List<Integer> listInt1=listInt.stream().filter(i-> i%2==0 ).collect(Collectors.toList());
		
		System.out.println(listInt1);
		
		
	}

}
