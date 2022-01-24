package com.calculation.serviceinterface.callService;

import java.util.Scanner;


import com.calculation.serviceinterface.implementationClass.OddSum;

public class CallOddSum {
	
	 public void callOddService(){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Initial value :");
	        int ini = sc.nextInt();
	         System.out.println("Enter final value :");
	        int fin=sc.nextInt();
	        
	        OddSum ess=new OddSum();
	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	    }

}
