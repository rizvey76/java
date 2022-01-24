package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.doer.calculator.common.CalculatorModel;
import com.doer.calculator.service.SumService;


public class InputTakenSum {
	
	Logger logger=LogManager.getLogger(InputTakenEvenSum.class);
	 public void callSumService(){
			
//		    CalculatorModel cmodel=new CalculatorModel();
//	        Scanner sc=new Scanner(System.in);
//	        System.out.println("Enter value :");
//	        int ini = sc.nextInt();     //initial value
//	        
//	        cmodel.setInitialValue(ini);
//	        
	       
	        
	        
	        
	        SumService sum=new SumService();
//	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	        
	        
	        
	        

			logger.info("Sum Of  Numbers is: "+sum.calculate()+"\r\n");

	    }

}
