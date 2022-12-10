package com.inheritance;

public class B extends A{

	public void display() {
		
		System.out.println("Hello");
	}
	
	public static void print() {
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
		
		B b=new B();
		b.display();
		
		
		B b1=new B();
		b1.display();
		
		A a=new A();
		a.display();
		
		A a1=new B();
		a1.display();
		
		A.print();
		
		
		// private members ( fields , methods, inner class ) not shared to child class
	}

}
