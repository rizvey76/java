package com.doer.calculator.service;

import java.util.Scanner;

import com.doer.calculator.common.Calculator;

public class OddSumService extends Calculator{

	@Override
	public void calculate() {
		Scanner sc=new Scanner(System.in);
		OddSumService caladdition=new OddSumService();
        System.out.println("Enter Initial value :");
        caladdition.setInitialValue(sc.nextInt());	
        System.out.println("Enter final value :");
        caladdition.setFinalValue(sc.nextInt());
		
	    int initialValue=caladdition.getInitialValue();
	    int finalValue=caladdition.getFinalValue();
	    
	   
	    
        int sum=0;
		
		if(initialValue < finalValue) {
	        for(int i=initialValue;i<=finalValue;i++){    
	            if(i%2!=0){        //condition for sort out even numbers
	              sum=sum+i;
//	                System.out.println(sum);
	            }
	        }
	        System.out.println(sum);
	       
		}else {
			System.out.println("Invalid Input, status: initial value is larger than final");
		}
		
	

	}
}
