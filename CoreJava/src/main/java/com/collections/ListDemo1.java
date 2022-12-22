package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		
		// 1. Insertion order followed
		
		List<String> list1=new ArrayList<String>();
		
		System.out.println(list1.isEmpty()); // true
		
		list1.add("A");
		list1.add("C");
		list1.add(1,"B");
		
		list1.addAll(List.of("F","G"));
		list1.addAll(0,List.of("D","E"));
		
		System.out.println("sub list " +list1.subList(0, 3));
		System.out.println(list1);
		
		System.out.println(list1.remove(0));
		
		System.out.println(list1.remove("C"));

		System.out.println(list1);
		
		//System.out.println(list1.get(5));
		
		 System.out.println(list1.set(0, "R"));
		
			System.out.println(list1);
	}
	

}
