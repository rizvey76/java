package com.calculation.serviceInterface.callService;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.calculation.serviceInterface.implementationClass.OddSumService;



public class CallOddSumService {
	
	Logger logger=LogManager.getLogger(CallOddSumService.class);
	
	@Test
	 public void callOddService(){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Initial value :");
	        int ini = sc.nextInt();  //initial value
	         System.out.println("Enter final value :");
	        int fin=sc.nextInt();   //final value
	        
	        OddSumService ess=new OddSumService();
//	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	        
	        
	        

			logger.info("Sum Of Odd Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin)+"\r\n");

	    }

}
