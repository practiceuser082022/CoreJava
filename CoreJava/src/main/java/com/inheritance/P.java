package com.inheritance;

public class P { // Parent class\Super class\ Base class
   
	public String name="Ramu";
	public int age=20;
	
	
	public P() {
		System.out.println("Parent");
	}
	
	public void dispDetails() {
		
		System.out.println("Name "+name);
		System.out.println("Age "+ age);
	}
}
