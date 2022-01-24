package com.test.call;

class Value1{
	public int change(int takeInput) {
		return takeInput=50;
	}
}




public class CallByRef {
	

	public static void main(String[] args) {
	int inputValue=20;
		
		Value1 v=new Value1();
		System.out.println(v.change(inputValue));
		
	}

}
