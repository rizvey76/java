package com.calculation.serviceinterface.main;

import java.util.Scanner;

import com.calculation.serviceinterface.callService.CallEvenSum;
import com.calculation.serviceinterface.callService.CallOddSum;
import com.calculation.serviceinterface.callService.CallSeriesSum;




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
        	   CallEvenSum ces=new CallEvenSum();
	           ces.callEvenService();
	           new SelectService().serviceTaken();
        	   break;
           case 2:
        	   CallOddSum cos=new CallOddSum();
 	          cos.callOddService();
 	         new SelectService().serviceTaken();
        	   break;
           case 3:
        	   CallSeriesSum css=new CallSeriesSum();
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
