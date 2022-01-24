package com.doer.calculation.callService;

import java.util.Scanner;

import com.doer.calculation.service.EvenSumService;

public class CallEvenService {
    public void callEvenService(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Initial value :");
        int ini = sc.nextInt();
         System.out.println("Enter final value :");
        int fin=sc.nextInt();
        
        EvenSumService ess=new EvenSumService();
        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.evenSum(ini,fin));
    }

}
