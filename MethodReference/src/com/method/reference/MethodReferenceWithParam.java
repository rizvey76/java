package com.method.reference;



interface EngineName{
	public void name(String ename);
}

public class MethodReferenceWithParam {

	public static void main(String[]args) {
//		EngineName engineName=(ename)-> System.out.println( ename); ///with Lambda Expression
//		
//		
//		engineName.name("Hino Motor");
		
		
		EngineName engineName=(System.out::println); ///with Method Reference By Parameter
		
		///// Since out is an object and name(String ename) is not static
		engineName.name("Hino Motor");
	}
}
