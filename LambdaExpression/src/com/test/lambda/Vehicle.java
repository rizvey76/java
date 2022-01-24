package com.test.lambda;

@FunctionalInterface
interface Engine{
	public void fuel();
}

public class Vehicle {
	
	public static void main(String[]args) {
		Engine engine=()-> System.out.println("This engine use gas as fuel"); ///lambda expression
		engine.fuel();
		
	}

}
