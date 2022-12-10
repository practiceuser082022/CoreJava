package com.inheritance;

public class A {

	private String name;
	public String address;
	protected String education;
	String job;
	
	
	public void display() {
		
		System.out.println("Hi");
	}
	
	
	public static void print() {
		System.out.println("Hi");
	}
	
	private void add() {
		System.out.println("Private");
	}
}
