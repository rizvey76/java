package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.doer.calculator.common.CalculatorModel;
import com.doer.calculator.main.CalculatorApp;
import com.doer.calculator.service.DivisionService;


public class InputTakenDivision {
	int result;
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
	        
	        
	        result=divS.calculate(cmodel.getInitialValue(),cmodel.getFinalValue());
	        

			logger.info("Division value between "+ini+" And "+fin+" is: "+result+"\r\n");
			
			System.out.println("Do you want to farther operation over the result? y/n ");
			
			Scanner sc1=new Scanner(System.in);
			String st=sc1.next();
			
			if(st.equals("y")) {
				calculation(result);
			}else if(st.equals("n")) {
				System.out.println("Your result has beeen saved ");
			}
			
			

	    }
	 
	 
	 
	 public void calculation(int result) {
		 System.out.println("1 = Addition , 2 = Subtraction , 3 = Division , 4 = Multiplication , 0 = Termination ");
		 Scanner sc=new Scanner(System.in);
		 int inputValue=sc.nextInt();
		 
         switch(inputValue) {
         case 1:
        	 System.out.println("Enter value that you want to add");
        	 int v1=sc.nextInt();
        	 result+=v1;
        	 System.out.println(result);
        	 calculation(result);
        	 
      	   break;
      	   
         case 2:
        	 System.out.println("Enter value that you want to subtract");
        	 int v2=sc.nextInt();
        	 result-=v2;
        	 System.out.println(result);
        	 calculation(result);
        	 
      	   break;
    
         case 3:
        	 System.out.println("Enter the value of divisor");
        	 int v3=sc.nextInt();
        	 result/=v3;
        	 System.out.println(result);
        	 calculation(result); 
        	 
      	   break;
      	   
         case 4:
        	 System.out.println("Enter the value for multiplying ");
        	 int v4=sc.nextInt();
        	 result*=v4;
        	 System.out.println(result);
        	 calculation(result);
        	 
      	   break; 
      	   
      	   
      
         case 0:
        	 System.out.println("Final Result: "+result);
        	 
      	   break;
       	   
         default:
        	 System.out.println("Void Result");
        	 break;
         
         }
		 
		 
	 }

}
