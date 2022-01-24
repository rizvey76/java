package com.calculation.serviceinterface.implementationClass;

import com.calculation.serviceinterface.Iservice;

public class SeriesSum implements Iservice {

	@Override
	public int calculation(int initialValue, int finalValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	////Method OverLoading
	public int calculation(int initialValue, int finalValue,int interval) {
		 int sum=0;
		 int n;
		 n=((finalValue-initialValue)/interval)+1;
		 
		 if(initialValue < finalValue) {
			 sum=n*initialValue+(n*(n-1)*interval)/2; 
		 }else {
			 System.out.println("Invalid Input, status: initial value is larger than final");  
		 }
	       
	       return sum;
	}

	
}
