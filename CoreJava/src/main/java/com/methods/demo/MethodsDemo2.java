package com.methods.demo;

public class MethodsDemo2 {
	
	public static String ename;
	public static int eage;
	
	
	public static void displayEmployeeDetails() {
		
		System.out.println("Employee Name "+ ename);
		System.out.println("Employee Age "+ eage);
	}

	public static void main(String[] args) {
		
		MethodsDemo2.ename="Ram";
		MethodsDemo2.eage=40;
		
		MethodsDemo2.displayEmployeeDetails();
		
	}
}
