package com.test.stream1;

import java.util.stream.Stream;

public class StreamArray {
	
	public static void main(String[] args) {
		
		String [] arr= {"Toyota","Tata","KIA"};
		
		Stream<String> str=Stream.of(arr);
		
		
		str.forEach(i-> System.out.println(i));
	}

}
