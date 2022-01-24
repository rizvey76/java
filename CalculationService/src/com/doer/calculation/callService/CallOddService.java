package com.doer.calculation.callService;

import java.util.Scanner;

import com.doer.calculation.service.OddSumService;

public class CallOddService {
	  public void callOddService(){
		   
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Initial value :");
	        int ini = sc.nextInt();
	         System.out.println("Enter final value :");
	        int fin=sc.nextInt();
	        
	        OddSumService ess=new OddSumService();
	        System.out.println("Sum Of Odd Numbers between "+ini+" And "+fin+" is: "+ess.oddSum(ini,fin));
	    }

}
