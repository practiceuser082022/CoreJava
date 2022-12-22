package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue<Integer>();
		
		
		q.add(3);
		q.add(1);
		q.offer(2);
		//q.add(null);
		q.add(3);
		q.add(10);
		
		
		System.out.println(q);
		
		System.out.println(q.peek());
		System.out.println(q.remove(1));

		System.out.println(q);
		
		
		System.out.println(q.poll()); // 2
		
		System.out.println(q);
		
		System.out.println(q.element());
		
		System.out.println("Using for each");
		for(Integer s: q) {
			
			System.out.println(s);
		}
		
		System.out.println("Using Iterator");
		Iterator<Integer> itr=q.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
