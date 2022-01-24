package com.calculation.serviceInterface.implementationClass;

import com.calculation.serviceInterface.IcalculationService;

public class SeriesSumService implements IcalculationService{

	@Override
	public int calculation(int initialValue, int finalValue) {
		// TODO Auto-generated method stub
		return 0;
	}
	
////Method OverLoading
	public int calculation(int initialValue, int finalValue,int interval) {
		 int sum=0;
		 int n;
		 n=((finalValue-initialValue)/interval)+1;  ///Mathematical formula for finding n'th terms value
		 
		 if(initialValue < finalValue) {
			 sum=n*initialValue+(n*(n-1)*interval)/2; ///Mathematical formula for finding Sum of series
		 }else {
			 System.out.println("Invalid Input, status: initial value is larger than final");  
		 }
	       
	       return sum;
	}

}
