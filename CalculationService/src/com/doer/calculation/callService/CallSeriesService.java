package com.doer.calculation.callService;

import java.util.Scanner;

import com.doer.calculation.service.SeriesSumService;

public class CallSeriesService {
	 public void callSeriesService(){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Initial value :");
	        int ini = sc.nextInt();
	         System.out.println("Enter final value :");
	        int fin=sc.nextInt();
	        
	         System.out.println("Enter interval value :");
	        int in=sc.nextInt();
	        
	        SeriesSumService sss=new SeriesSumService();
	        System.out.println("Sum Of Series Numbers between "+ini+" And "+fin+" Where Value Of Interval Is "+in+" : "+sss.seriesSum(ini, fin, in));
	    }
}
