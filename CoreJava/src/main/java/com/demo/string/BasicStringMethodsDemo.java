package com.demo.string;

public class BasicStringMethodsDemo {

	public static void main(String[] args) {
		
		String name="Shiva";  // literal
		
		String name1=new String("Ram"); // string object creation
		
		String name2=new String();
		String name3=new String("	");
		
		System.out.println(name.length());
		
		System.out.println(name.isEmpty()); // false
		
		System.out.println(name2.isEmpty()); // true
		
		System.out.println(name3.isBlank()); // true
		
		System.out.println(name.charAt(2)); // S
		
		
		System.out.println(name.toUpperCase()); // SHIVA
		System.out.println(name.toLowerCase()); // shiva
		
		
		String name4="              Hanuma                        ";
		
		System.out.println(name4.length());
		
		System.out.println(name4);
		System.out.println(name4.trim());
		
		
		
		
		char[] ch=name.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++) {
			
			System.out.println(ch[i]);
		}
		
		System.out.println(name1.toCharArray());
		
		
		
		String s1="Hello";
		String s2="hello";
		
		
	  System.out.println(s1.equals(s2)); // false
	  System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
