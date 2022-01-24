package com.calculation.serviceInterface.main;

import java.util.Scanner;

import org.junit.Test;

import com.calculation.serviceInterface.callService.CallEvenSumService;
import com.calculation.serviceInterface.callService.CallOddSumService;
import com.calculation.serviceInterface.callService.CallSeriesSumService;



public class SelectService {
	
	int num;
	
	
	public int serviceChoose() {
		   System.out.println("Enter 1 For Getting Service Of EvenSum");
	        System.out.println("Enter 2 For Getting Service Of OddSum");
	         System.out.println("Enter 3 For Getting Service Of SeriesSum");
	       Scanner sc=new Scanner(System.in);
	       return this.num=sc.nextInt();
	}
	
	
	public void serviceTaken() {
           int nnum = new SelectService().serviceChoose();
           
           switch(nnum) {
           case 1:
        	   CallEvenSumService ces=new CallEvenSumService();
	           ces.callEvenService();
	           new SelectService().serviceTaken();
        	   break;
           case 2:
        	   CallOddSumService cos=new CallOddSumService();
 	          cos.callOddService();
 	         new SelectService().serviceTaken();
        	   break;
           case 3:
        	   CallSeriesSumService css=new CallSeriesSumService();
  	           css.callSeriesService();
  	         new SelectService().serviceTaken();
        	   break;
          
           default:
        	   System.out.println("Invalid Input!"); 
 	           new SelectService().serviceTaken();
        	   
           
           }
           
	} 

           public static void main(String[]args) {
               new SelectService().serviceTaken();
        	}

}
