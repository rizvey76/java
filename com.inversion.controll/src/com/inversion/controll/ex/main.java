package com.inversion.controll.ex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StartEngine().runEngine(new Bike()); ///Here we have taken the control which obj will call
		                                         ///By XML config we can pass The class name for create obj for us

	}

}
