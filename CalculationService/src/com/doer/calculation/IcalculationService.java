package com.doer.calculation;

public interface IcalculationService {
	 public int sum();
	    public int sub();
	    public int multi();
	    public int div();
	    
	    public int evenSum(int initialValue,int finalValue);
	    public int oddSum(int initialValue,int finalValue);
	    
	    public int seriesSum(int initialValue,int finalValue,int interval);
}
