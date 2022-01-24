package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.doer.calculator.common.CalculatorModel;
import com.doer.calculator.service.DivisionService;


public class InputTakenDivision {
	
	Logger logger=LogManager.getLogger(InputTakenDivision.class);
	 public void callDivisionService(){
			
		    CalculatorModel cmodel=new CalculatorModel();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter First Value :");
	        int ini = sc.nextInt();     //initial value
	        
	        cmodel.setInitialValue(ini);
	        
	        System.out.println("Enter Second Value :");
	        int fin=sc.nextInt();   //final value
	        cmodel.setFinalValue(fin);
	        
	        
	        
	        DivisionService divS=new DivisionService();
//	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	        
	        
	        
	        

			logger.info("Division value between "+ini+" And "+fin+" is: "+divS.calculate(cmodel.getInitialValue(),cmodel.getFinalValue())+"\r\n");

	    }

}
