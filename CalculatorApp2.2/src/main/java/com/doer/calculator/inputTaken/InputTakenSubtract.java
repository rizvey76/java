package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.doer.calculator.common.CalculatorModel;
import com.doer.calculator.service.SubtractionService;


public class InputTakenSubtract {
	
	Logger logger=LogManager.getLogger(InputTakenSubtract.class);
	 public void callSubtractService(){
			
		    CalculatorModel cmodel=new CalculatorModel();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter First value :");
	        int ini = sc.nextInt();     //initial value
	        
	        cmodel.setInitialValue(ini);
	        
	         System.out.println("Enter Second value :");
	        int fin=sc.nextInt();   //final value
	        cmodel.setFinalValue(fin);
	        
	        
	        
	        SubtractionService sbsum=new SubtractionService();
//	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	        
	        
	        
	        

			logger.info("Subtraction value  between "+ini+" And "+fin+" is: "+sbsum.calculate(cmodel.getInitialValue(),cmodel.getFinalValue())+"\r\n");

	    }

}
