package com.hello.first;

import java.util.Scanner;

public class HelloWorld {

	 public static void main(String [] args) {
		 
		 System.out.println("Enter y/n");
		 Scanner sc=new Scanner(System.in);
		 
		 String ch=sc.next();
		 
		 if(ch.equals("y")) {
			 System.out.println("Hello World!"); 
		 }else {
			 System.out.println("kaj hoi nai"); 
		 }
		 
		 
		 
	 }

}
