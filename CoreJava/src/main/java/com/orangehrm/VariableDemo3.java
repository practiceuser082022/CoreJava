package com.orangehrm;

public class VariableDemo3 {

	int age=30; // instance variable
	static int salary=5000; // class variable
	

	
	public static void main(String[] args) {
		// args - local variable
		int x=20; // local variable
		
	
		VariableDemo3 vd=new VariableDemo3();
		
		System.out.println(vd.age); // instance variable should be accessed with object
		
		System.out.println(VariableDemo3.salary); // class variable can be accessed by classname or instance 
		
		System.out.println(x);
		
		
		// variable scope 
	}

}
