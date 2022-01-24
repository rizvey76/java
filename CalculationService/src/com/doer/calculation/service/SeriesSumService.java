package com.doer.calculation.service;

import com.doer.calculation.IcalculationService;

public class SeriesSumService implements IcalculationService{

	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multi() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int evenSum(int initialValue, int finalValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int oddSum(int initialValue, int finalValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int seriesSum(int initialValue, int finalValue, int interval) {
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
