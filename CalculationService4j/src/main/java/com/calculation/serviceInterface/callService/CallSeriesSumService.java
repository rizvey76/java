package com.calculation.serviceInterface.callService;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.calculation.serviceInterface.implementationClass.SeriesSumService;



public class CallSeriesSumService {
	
	Logger logger=LogManager.getLogger(CallSeriesSumService.class);
	
	@Test
	public void callSeriesService(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Initial value :");
        int ini = sc.nextInt();   //initial value
         System.out.println("Enter final value :");
        int fin=sc.nextInt();     //final value
        
         System.out.println("Enter interval value :");
        int in=sc.nextInt();    //interval value
        
        SeriesSumService service=new SeriesSumService();
//        System.out.println("Sum Of Series Numbers between "+ini+" And "+fin+" Where Value Of Interval Is "+in+" : "+sss.calculation(ini, fin, in));
        
        
        
        

		logger.info("Sum Of Series Numbers between "+ini+" And "+fin+" Where Value Of Interval Is "+in+" : "+service.calculation(ini, fin, in)+"\r\n");

    }

}
