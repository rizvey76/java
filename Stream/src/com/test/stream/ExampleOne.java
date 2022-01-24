package com.test.stream;

import java.util.Arrays;
import java.util.List;

public class ExampleOne {
	public static void main(String[] args) {
		List<Employee> employee=Arrays.asList(
				new Employee("Sam",42,50000),
				new Employee("Kim",45,52000),
				new Employee("Zong",31,40000)
				
				
				);
		
		
		employee.stream().filter(p-> p.getName().startsWith("S")).forEach(p-> System.out.println(p.getName()));
		
		
		;
		
		
		
		
		
		
		
	}

}
