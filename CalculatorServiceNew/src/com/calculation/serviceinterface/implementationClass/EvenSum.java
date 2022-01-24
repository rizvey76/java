package com.calculation.serviceinterface.implementationClass;

import com.calculation.serviceinterface.Iservice;

public class EvenSum implements Iservice {

	@Override
	public int calculation(int initialValue, int finalValue) {
		int sum=0;
		
		if(initialValue < finalValue) {
	        for(int i=initialValue;i<=finalValue;i++){
	            if(i%2==0){
	              sum=sum+i;
//	                System.out.println(sum);
	            }
	        }
	        
	       
		}else {
			System.out.println("Invalid Input, status: initial value is larger than final");
		}
		 return sum;  
	}

}
