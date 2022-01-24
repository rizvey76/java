package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.doer.calculator.common.CalculatorModel;
import com.doer.calculator.service.MultiplicationService;


public class InputTakenMultiplication {
	
	Logger logger=LogManager.getLogger(InputTakenMultiplication.class);
	 public void callMultiplicationService(){
			
//		    CalculatorModel cmodel=new CalculatorModel();
//	        Scanner sc=new Scanner(System.in);
//	        System.out.println("Enter First Value :");
//	        int ini = sc.nextInt();     //initial value
//	        
//	        cmodel.setInitialValue(ini);
//	        
//	         System.out.println("Enter Second value :");
//	        int fin=sc.nextInt();   //final value
//	        cmodel.setFinalValue(fin);
	        
	        
	        
	        MultiplicationService multiS=new MultiplicationService();
//	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	        
	        
	        
	        

			logger.info("Multiplication value is: "+multiS.calculate()+"\r\n");

	    }

}
