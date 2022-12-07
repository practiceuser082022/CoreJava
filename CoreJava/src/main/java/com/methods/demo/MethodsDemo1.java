package com.methods.demo;

public class MethodsDemo1 {
	
	
	public String sname;
	public int sage;
	
	public void displayStudentDetails() {
		
		System.out.println("Student Name "+ sname);
		System.out.println("Student Age "+ sage);
		
	}

	public static void main(String[] args) {
		
		MethodsDemo1 md1=new MethodsDemo1();
		md1.sname="Ram";
		md1.sage=18;
		
		md1.displayStudentDetails();
		
		
		
		MethodsDemo1 md2=new MethodsDemo1();
		md2.sname="Sam";
		md2.sage=22;
		md2.displayStudentDetails();
		
		
		System.out.println(md1.hashCode());
		System.out.println(md2.hashCode());
	}

}
