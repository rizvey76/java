package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
public static void main(String[] args) {
	ArrayList <String> nlist=new ArrayList<>();
	nlist.add("Abdul");
	nlist.add("Babar");
	nlist.add("Danish");
	nlist.add("Tahir");
	
	System.out.println(nlist); ////print list data
	
	nlist.remove(0);
	
	System.out.println(nlist); 
	
	
	String name=nlist.get(2);  ///to get specific data
	System.out.println(name); 
	
	
	nlist.set(2,"Samir");  ////update list
	System.out.println(nlist);
	
	
	System.out.println("\n");
	
	
	Iterator<String> itr=nlist.iterator();  ///Print data using Iterator Interface
	
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
}
}
