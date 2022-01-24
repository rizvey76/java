package com.calculation.serviceInterface.implementationClass;

import com.calculation.serviceInterface.IcalculationService;

public class EvenSumService implements IcalculationService {

	@Override
	public int calculation(int initialValue, int finalValue) {
		int sum=0;
		
		if(initialValue < finalValue) {
	        for(int i=initialValue;i<=finalValue;i++){    
	            if(i%2==0){       
	              sum=sum+i;

	            }
	        }
	        
	       
		}else {
			System.out.println("Invalid Input, status: initial value is larger than final");
		}
		 return sum;  
	}

}
