package com.calculation.serviceinterface.callService;

import java.util.Scanner;

import com.calculation.serviceinterface.implementationClass.SeriesSum;



public class CallSeriesSum {
	public void callSeriesService(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Initial value :");
        int ini = sc.nextInt();
         System.out.println("Enter final value :");
        int fin=sc.nextInt();
        
         System.out.println("Enter interval value :");
        int in=sc.nextInt();
        
        SeriesSum sss=new SeriesSum();
        System.out.println("Sum Of Series Numbers between "+ini+" And "+fin+" Where Value Of Interval Is "+in+" : "+sss.calculation(ini, fin, in));
    }
}
