package com.methods.demo;

public class Calculate {
	
	int x=10,y=20;
	

	public void addNumbers() {
		
		System.out.println("After adding "+ (x+y));
	}
	
	public void subNumbers() {
		
		System.out.println("After sub "+ (x-y));
	}
	
	public void mulNumbers() {
		
		System.out.println("After mul "+ (x*y));
	}
	
	
	public void divNumbers() {
		
		System.out.println("After div "+ (x/y));
	}
	
	public void ratioNumbers() {
		
		System.out.println("After ratio "+ (x%y));
	}
	
	public static void main(String[] args) {
	

		Calculate c=new Calculate();
		
		c.addNumbers();
		c.mulNumbers();
		c.subNumbers();
		c.ratioNumbers();
		c.divNumbers();
	
		
	}

}
