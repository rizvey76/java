package com.test.lambda;

interface EngineName{
	public void name(String ename);
}

public class Vehicle1 {
	
	public static void main(String[]args) {
		EngineName engineName=(ename)-> System.out.println("This Vehicle Use"+" "+ ename+" "+"Engine"); ///with parameter
		engineName.name("Hino");
	}

}
