package com.doer.calculator.service;

import java.util.Scanner;

import com.doer.calculator.common.Calculator;

public class AdditionService extends Calculator {


	
	
	@Override
	public void calculate() {
		Scanner sc=new Scanner(System.in);
//        Calculator caladdition=new Calculator();
        
        AdditionService caladdition=new AdditionService();
        System.out.println("Enter Initial value :");
        caladdition.setInitialValue(sc.nextInt());	
        System.out.println("Enter final value :");
        caladdition.setFinalValue(sc.nextInt());
		
	    int initialValue=caladdition.getInitialValue();
	    int finalValue=caladdition.getFinalValue();
	    
	    
	
	System.out.println(initialValue);
	System.out.println(finalValue);
	};

}
