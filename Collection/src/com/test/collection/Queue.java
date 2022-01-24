package com.test.collection;

import java.util.PriorityQueue;

public class Queue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		
		
		
		for(int i=10; i >0 ;i--) {
			queue.add(i);
		}
		
		System.out.println(queue);
		
		
//		System.out.println("Queue size is"+": "+queue.size()); 
//		
//		System.out.println("Head Of The Queue "+queue.peek()); //To Print Head of The Queue
//		
//		queue.poll(); ///Removing the head
//		
//		
//		
//		System.out.println(queue);
//		
//		System.out.println("Head Of The Queue "+queue.peek());
//		
	}

}
