package com.design.singletone;


class ClassEnum {
	public static void main(String[] args) {
		SingleToneEnum obj1=SingleToneEnum.INSTANCE;
		SingleToneEnum obj2=SingleToneEnum.INSTANCE;
		
		
		System.out.println(obj1.showMessage());
		System.out.println(obj2.showMessage());
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}
}


public enum SingleToneEnum {
	
	INSTANCE;
	
	public String showMessage() {
		return "SingleTone Achieved!";
	}

}
