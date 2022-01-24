package com.data.structure;

public class ArrayTwo {
	
	 public static void main(String[] args) {
	        System.out.println("Example of Two Dimensional Array or Matrix");
	        int[][] arr = {{1, 2, 6}, {3, 4, 7}};
	 
	        for (int i = 0; i <arr.length; i++) {
	            for (int j = 0; j <arr[i].length; j++) {
	            	
	            	System.out.print(arr[i][j]+" ");
//	                System.out.println("arr[" + i + "][" + j + "] = "
//	                        + arr[i][j]);
	            }
	            
	            System.out.println();
	    }

}
}
