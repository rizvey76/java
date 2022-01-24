package com.calculation.serviceInterface.callService;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.calculation.serviceInterface.IcalculationServicee;
import com.calculation.serviceInterface.implementationClass.EvenSumService;





public class CallEvenSumService {
	
	Logger logger=LogManager.getLogger(CallEvenSumService.class);
	
	@Test
	 public void callEvenService(){
		
		    IcalculationServicee servicee=new IcalculationServicee();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Initial value :");
	        int ini = sc.nextInt();     //initial value
	        
	        servicee.setInitialValue(ini);
	        
	         System.out.println("Enter final value :");
	        int fin=sc.nextInt();   //final value
	        servicee.setFinalValue(fin);
	        
	        
	        
	        EvenSumService ess=new EvenSumService();
//	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	        
	        
	        
	        

			logger.info("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(servicee.getInitialValue(),servicee.getFinalValue())+"\r\n");

	    }

}
