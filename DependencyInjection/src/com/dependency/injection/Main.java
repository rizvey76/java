package com.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		Bike bike=ac.getBean("bikeBean",Bike.class);
		bike.bikeStarted();
		
		Car car=ac.getBean("carBean",Car.class);
		car.carStarted();

	}

}
