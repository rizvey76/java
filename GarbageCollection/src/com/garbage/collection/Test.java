package com.garbage.collection;

public class Test {
	
	int a;
	int b;

	  public void setData(int c,int d){
	    a=c;
	    b=d;
	  }
	  public void showData(){
	    System.out.println("Value of a = "+a);
	    System.out.println("Value of b = "+b);
	  }
	  public static void main(String args[]){
	    Test s1 = new Test();
	    Test s2 = new Test();
	    s1.setData(1,2);
	    s2.setData(3,4);
	    s1.showData();
	    s2.showData();
	    
	    
	    //Student s3;
	    //s3=s2;
	    //s3.showData();
	    //s2=null;
	    //s3.showData();
	    //s3=null;
	    //s3.showData();
	  }

}
