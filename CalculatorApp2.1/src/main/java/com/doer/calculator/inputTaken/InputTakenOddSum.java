package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.doer.calculator.common.CalculatorModel;

import com.doer.calculator.service.OddSumService;

public class InputTakenOddSum {

	Logger logger=LogManager.getLogger(InputTakenOddSum.class);
	 public void callOddService(){
			
		    CalculatorModel cmodel=new CalculatorModel();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Initial value :");
	        int ini = sc.nextInt();     //initial value
	        
	        cmodel.setInitialValue(ini);
	        
	         System.out.println("Enter final value :");
	        int fin=sc.nextInt();   //final value
	        cmodel.setFinalValue(fin);
	        
	        
	        
	        OddSumService osum=new OddSumService();
//	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	        
	        
	        
	        

			logger.info("Sum Of Odd Numbers between "+ini+" And "+fin+" is: "+osum.calculate(cmodel.getInitialValue(),cmodel.getFinalValue())+"\r\n");

	    }
}
