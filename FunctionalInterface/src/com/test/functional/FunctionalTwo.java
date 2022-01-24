package com.test.functional;

import java.util.function.Consumer;

class Employee{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class FunctionalTwo {
	public static void main(String[] args) {
		Employee ename=new Employee();
		
		Consumer<Employee> consumer=(employee)-> employee.setName("Zamil");      ////Consumer Interface just modify data no output
		
		consumer.accept(ename);
		
		System.out.println(ename.getName());
		
	}

}
