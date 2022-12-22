package com.collections;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		
		
		List<String> list1=new LinkedList<String>();
		
		list1.add("A");
		list1.add("C");
		
		list1.add("A");
		
		System.out.println(list1);
		list1.add(1,"B");
		System.out.println(list1);
		
		list1.addAll(0,List.of("D","E"));
		
		System.out.println(list1);
		System.out.println("sub list " +list1.subList(0, 3));
		
		System.out.println("last index "+ list1.lastIndexOf("A"));
		
		System.out.println(list1);
		
		System.out.println(list1.get(0));
		
		System.out.println(list1.remove("A"));
		System.out.println(list1.remove(1));
		
		System.out.println(list1.set(0, "T"));
		
		System.out.println(list1);
		System.out.println(list1.indexOf("C"));
		
		
		
	}

}
