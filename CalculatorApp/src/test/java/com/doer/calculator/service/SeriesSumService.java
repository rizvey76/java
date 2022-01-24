package com.doer.calculator.service;

import java.util.Scanner;

import com.doer.calculator.common.Calculator;

public class SeriesSumService extends Calculator {

	@Override
	public void calculate() {
		Scanner sc=new Scanner(System.in);
		SeriesSumService caladdition=new SeriesSumService();
        
        
        System.out.println("Enter Initial value :");
        caladdition.setInitialValue(sc.nextInt());	
        System.out.println("Enter final value :");
        caladdition.setFinalValue(sc.nextInt());
        
        System.out.println("Enter interval value :");
        caladdition.setInterval(sc.nextInt());
		
	    int initialValue=caladdition.getInitialValue();
	    int finalValue=caladdition.getFinalValue();
	    int intervalValue=caladdition.getInterval();
	    
	    
	    
	    int sum=0;
		 int n;
		 n=((finalValue-initialValue)/intervalValue)+1;  ///Mathematical formula for finding n'th terms value
		 
		 if(initialValue < finalValue) {
			 sum=n*initialValue+(n*(n-1)*intervalValue)/2; ///Mathematical formula for finding Sum of series
			 
			 
			 System.out.println(sum);
		 }else {
			 System.out.println("Invalid Input, status: initial value is larger than final");  
		 }
	
	};
}
