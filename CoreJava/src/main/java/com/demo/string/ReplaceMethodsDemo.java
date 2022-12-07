package com.demo.string;

public class ReplaceMethodsDemo {

	public static void main(String[] args) {
		
		String s="Java Programming";
		
		System.out.println(s.replace('a', 'A'));
		
		System.out.println(s.replaceFirst("m", "M"));
		
		System.out.println(s.replaceAll("mm", "MM"));
		
		System.out.println(s.startsWith("Java"));
		
		System.out.println(s.startsWith("Pro",5));
		
		String name="Hello World";
		
		System.out.println(name.substring(6));
		
		System.out.println(name.substring(6,8));
	}
}
