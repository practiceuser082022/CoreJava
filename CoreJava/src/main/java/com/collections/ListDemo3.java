package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		
		
		System.out.println("Using for loop");
		for(int i=0;i<al.size();i++) {
			
			System.out.println(al.get(i));
		}
		
		
		System.out.println("Using for each");
		for(String s: al) {
			
			System.out.println(s);
		}
		
		System.out.println("Using Iterator");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		ListIterator<String> litr=al.listIterator();
		
		while(litr.hasNext()) {
			
			System.out.println(litr.next());
			
			
		}

		while(litr.hasPrevious()) {
			
			System.out.println(litr.previous());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
