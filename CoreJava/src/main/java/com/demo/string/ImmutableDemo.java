package com.demo.string;

public class ImmutableDemo {

	public static void main(String[] args) {
		
		String s="Hello World!";
		
		
		System.out.println(s.hashCode());

		s.toUpperCase();
		
		System.out.println(s);
		
		s.concat(" Java Here.");
		
		System.out.println(s.concat(" Java Here."));
		System.out.println(s);
	}

}
