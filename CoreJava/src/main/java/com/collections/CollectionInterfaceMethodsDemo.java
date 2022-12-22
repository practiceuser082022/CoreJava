package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterfaceMethodsDemo {

	public static void main(String[] args) {
		
		Collection<String> c=new ArrayList<String>();
		
		System.out.println(c.add("Ramu"));
		c.add("Somu");
		
		//c.addAll(List.of("Hari","Giri"));
	
		System.out.println(c.addAll(List.of("Hari","Giri")));
		
		System.out.println(c);
		
		System.out.println(c.remove("Ramu"));
		System.out.println(c.remove("Chari"));
		
		System.out.println(c);
		
		
		System.out.println(c.removeAll(List.of("Hari","Giri")));
		
		System.out.println(c);
		
		c.clear();
		
		System.out.println(c);
		
		Collection<String> c1=new ArrayList<String>();
		
		System.out.println("C1 E --> "+c1.isEmpty());
		
		c1.add("A");
		c1.add("B");
		c1.add("C");
		c1.add("D");
		
		
		System.out.println("size of the collection "+c1.size());
		
		System.out.println("C1 A   -->"+c1.isEmpty());
		
		System.out.println(c1);
		
		c1.retainAll(List.of("A","D"));
		
		System.out.println(c1);
		
		System.out.println(c1.contains("A")); // true
		System.out.println(c1.contains("C")); // false
		
		
		System.out.println(c1.containsAll(List.of("A","D"))); //true
		
		System.out.println(c1.containsAll(List.of("B","C"))); // false
		
		
		
		String s1="Ramu";
		String s2="Somu";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
