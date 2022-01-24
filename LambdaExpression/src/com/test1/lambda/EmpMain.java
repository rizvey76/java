package com.test1.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Employee> list = new ArrayList<>();
        list.add(new Employee("Mezba",26,20000));
        list.add(new Employee("Aiman",27,21000));
        list.add(new Employee("Babar",25,19000));
        
        
        
//        Collections.sort(list, new Comparator<Employee>() {          ////With out lambda expression
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//        	
//        });
//        
        
        
        Collections.sort(list,(o1,o2)->       ////With lambda expression

			
			
				// TODO Auto-generated method stub
				 o1.getName().compareTo(o2.getName())
			
        	
        );
        
        new EmpMain().printAll(list);  
        new EmpMain().fSalary(list);    
	}
	
	
	public void fSalary(List<Employee> list) {
		for(Employee e:list) {
			if(e.getSalary()>19000) {
				System.out.println(e);
			}
	}
	}
	
	public void printAll(List<Employee> list) {
		for(Employee e:list) {
			System.out.println(e);
		}
	}

}
