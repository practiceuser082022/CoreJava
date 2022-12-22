package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<String>();
		
		// hashset does not preserve insertion
		
		set.add("C");
		set.add("A");
		set.add("B");
		set.add("A");
		set.add(null);
		
		System.out.println(set);

		
		Set<String> tset=new TreeSet<String>();
		
		tset.add("C");
		tset.add("A");
		tset.add("B");
		tset.add("A");
		tset.add(null);
		
		System.out.println(tset);
		
		
		Set<String> lhset=new LinkedHashSet<String>();
		
		// hashset does not preserve insertion
		
		lhset.add("C");
		lhset.add("A");
		lhset.add("B");
		lhset.add("A");
		
		System.out.println(set);	
		
		
		System.out.println("Using for each");
		for(String s: set) {
			
			System.out.println(s);
		}
		
		System.out.println("Using Iterator");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
	}

}
