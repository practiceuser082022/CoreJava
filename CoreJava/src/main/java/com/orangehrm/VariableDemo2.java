package com.orangehrm;

public class VariableDemo2 {

	// Primitive Data Types
	
	byte bvariable;
	short svariable;
	int ivariable;
	long lvariable;
	
	float fvariable;
	double dvariable;
	
	boolean vflag;
	
	char ch;
	
	// Reference Data Types
	
	String name;
	
	public static void main(String[] args) {
		
		VariableDemo2 vd=new VariableDemo2();
		
		
		System.out.println(" byte variable value "+ vd.bvariable);
		
		System.out.println(" double variable value "+ vd.dvariable);
		
		System.out.println(" boolean variable value "+ vd.vflag);
		
		System.out.println(" char variable value "+ vd.ch);

		System.out.println(" Reference data type name value "+ vd.name);
	}

}
