package com.test.lambda;

@FunctionalInterface
interface EngineType{
	public String engineType(String type);
}

public class Vehicle2 {
	public static void main(String [] args) {
		
		EngineType engine=(type)->{  ///lambda Expression with return 
			return type;
		};
		
		String typeName=engine.engineType("Auto");
		
		System.out.println("Type of the engine is "+""+typeName);
		
	}

}
