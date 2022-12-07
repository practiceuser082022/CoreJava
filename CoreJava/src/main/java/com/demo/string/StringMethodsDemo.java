package com.demo.string;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		String name="Hello World";
		
		System.out.println(name.length());
		
		System.out.println(name.indexOf('l'));
		
		
		System.out.println(name.indexOf('l', 5));
		
		System.out.println(name.indexOf("World"));
		
		
		System.out.println(name.indexOf("llo", 1));
		
		System.out.println(name.lastIndexOf('l'));
		
		System.out.println(name.lastIndexOf('l', 8));
		
		System.out.println(name.lastIndexOf("llo"));
		
		System.out.println(name.lastIndexOf("ld",name.length()-1));
	}

}
