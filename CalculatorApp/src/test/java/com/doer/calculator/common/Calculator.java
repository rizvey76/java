package com.doer.calculator.common;

public abstract class Calculator {
	private int initialValue;
	private int finalValue;
	private int interval;
	
	
	public void calculate() {
	
	};
	
	public void takenService() {
		
	};
	
	
	
	public int getInitialValue() {
		return initialValue;
	}
	public void setInitialValue(int initialValue) {
		this.initialValue = initialValue;
	}
	public int getFinalValue() {
		return finalValue;
	}
	public void setFinalValue(int finalValue) {
		this.finalValue = finalValue;
	}
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	
	

}
