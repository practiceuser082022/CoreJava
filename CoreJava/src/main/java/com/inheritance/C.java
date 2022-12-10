package com.inheritance;


// C Child class \Sub class \ extended class \derived 

public class C extends P{
	
	public float salary=3456.54f;
	
	public C() {
		super();
		System.out.println("Child");
	}
	
	
	public void displaySalary() {
		
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		C c=new C();
		
		c.dispDetails();
		c.displaySalary();
		
		
		System.out.println(c.name); // field
	}
	
}
