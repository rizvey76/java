package com.doer.calculator.main;

import java.util.Scanner;


import com.doer.calculator.common.Calculator;

import com.doer.calculator.service.AdditionService;
import com.doer.calculator.service.EvenSumService;
import com.doer.calculator.service.OddSumService;
import com.doer.calculator.service.SeriesSumService;


public class CalculatorApp extends Calculator {

	int num;
	
	
	public int serviceChoose() {
		     System.out.println("Enter 1 For Getting Service Of EvenSum");
	         System.out.println("Enter 2 For Getting Service Of OddSum");
	         System.out.println("Enter 3 For Getting Service Of SeriesSum");
	       Scanner sc=new Scanner(System.in);
	       return this.num=sc.nextInt();
	       
	}
	


	@Override
	public void takenService() {
		 Calculator calculator;
		
		 int insertValue = new CalculatorApp().serviceChoose();
         
         switch(insertValue) {
         case 1:
        	 calculator=new EvenSumService();
          calculator.calculate();
	       new CalculatorApp().serviceChoose();   
      	   break;
         case 2:
        	   calculator=new OddSumService();
         calculator.calculate();
   	       new CalculatorApp().serviceChoose();
      	   break;
         case 3:
        	 calculator=new SeriesSumService();
        	 calculator.calculate();
     	     new CalculatorApp().serviceChoose();
      	break;
        
         default:
      	   System.out.println("Invalid Input!"); 
      	 new CalculatorApp().serviceChoose();
      
      	   
         
         }
		
	}
	
	
	
    public static void main(String[]args) {
        new CalculatorApp().takenService();
 	}
	

}
