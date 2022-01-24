package com.test.generics;

import java.util.ArrayList;

public class MyCustomList<T> {  ///Define type of class 
	
	ArrayList<T> list=new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	
	
	public void removeElement(T element) {
		list.remove(element);
	}


	@Override
	public String toString() {
		return "MyCustomList list=" + list + "";
	}
	
	public T getValue(int index) {
		return list.get(index);
	}
	
	
	

}
