package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.doer.calculator.common.CalculatorModel;
import com.doer.calculator.service.EvenSumService;



public class InputTakenEvenSum {
	
	Logger logger=LogManager.getLogger(InputTakenEvenSum.class);
	 public void callEvenService(){
			
		    CalculatorModel cmodel=new CalculatorModel();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Initial value :");
	        int ini = sc.nextInt();     //initial value
	        
	        cmodel.setInitialValue(ini);
	        
	         System.out.println("Enter final value :");
	        int fin=sc.nextInt();   //final value
	        cmodel.setFinalValue(fin);
	        
	        
	        
	        EvenSumService esum=new EvenSumService();
//	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	        
	        
	        
	        

			logger.info("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+esum.calculate(cmodel.getInitialValue(),cmodel.getFinalValue())+"\r\n");

	    }

}
