package com.doer.calculation.service;

import com.doer.calculation.IcalculationService;

public class EvenSumService implements IcalculationService {

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

	@Override
	public int oddSum(int initialValue, int finalValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int seriesSum(int initialValue, int finalValue, int interval) {
		// TODO Auto-generated method stub
		return 0;
	}

}
