package com.test.generics;

public class GenericsRunner {
	
	public static void main(String[] args) {
		MyCustomList <String> mList=new MyCustomList<>();
		
		mList.addElement("Hello");
		
		System.out.println(mList);
		
		System.out.println(mList.getValue(0));
		
		MyCustomList <Integer> mList2=new MyCustomList<>();
		mList2.addElement(10);
		
		System.out.println(mList2);
		
		System.out.println(mList2.getValue(0));
	}

}
