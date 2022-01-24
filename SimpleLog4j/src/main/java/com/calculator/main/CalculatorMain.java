package com.calculator.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorMain {

	static Logger logger=LogManager.getLogger(CalculatorMain.class);
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World! ");
		
		logger.trace("This is trace");
		logger.info("This is information"+":  "+ new CalculatorMain().sum(10,12));
		logger.warn("This is warning");
		logger.error("This is error");
		logger.fatal("This is fatal");
		
		System.out.println("complete");
	}

}
