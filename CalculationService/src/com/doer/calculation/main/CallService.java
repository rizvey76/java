package com.doer.calculation.main;

import java.util.Scanner;

import com.doer.calculation.callService.CallEvenService;
import com.doer.calculation.callService.CallOddService;
import com.doer.calculation.callService.CallSeriesService;

public class CallService {
	int num;
	public int serviceChoose() {
		   System.out.println("Enter 1 For Getting Service Of EvenSum");
	        System.out.println("Enter 2 For Getting Service Of OddSum");
	         System.out.println("Enter 3 For Getting Service Of SeriesSum");
	       Scanner sc=new Scanner(System.in);
	       return this.num=sc.nextInt();
	}
	
	public void serviceTaken() {
           int nnum = new CallService().serviceChoose();
           
           switch(nnum) {
           case 1:
        	   CallEvenService ces=new CallEvenService();
	           ces.callEvenService();
        	   break;
           case 2:
        	   CallOddService cos=new CallOddService();
 	          cos.callOddService();
        	   break;
           case 3:
        	   CallSeriesService css=new CallSeriesService();
  	           css.callSeriesService();
        	   break;
           default:
        	   System.out.println("Invalid Input!"); 
 	           new CallService().serviceTaken();
        	   break;
           
           }
           
           
	       
//	       if(nnum ==1){
//	           CallEvenService ces=new CallEvenService();
//	           ces.callEvenService();
//	       }else if(nnum==2){
//	          CallOddService cos=new CallOddService();
//	          cos.callOddService();
//	       }else if(nnum==3){
//	         CallSeriesService css=new CallSeriesService();
//	         css.callSeriesService();
//	       }else{
//	          System.out.println("Invalid Input!"); 
//	          new CallService().serviceTaken();
//	       }
	}
	
	public static void main(String[]args) {
       new CallService().serviceTaken();
	}

}
