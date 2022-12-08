package com.constructors.demo;

public class CDemo {

	
	int x;
	
	public CDemo() {
		System.out.println("No arg constructor");
	}
	
	public CDemo(int a) {
		System.out.println(a);
	}

	public CDemo(int a,int b) {
		
	}
	
	public CDemo(float a,int b) {
		
	}
	public static void main(String[] args) {
		

		CDemo cd=new CDemo();
		
		CDemo cd1=new CDemo(10);
	}
	
	
	// 1. constructor / method name should same
	// 2. arguments 
	      // a. no of arguments
	      // b. order of arguments
	      // c. type of arguments

}
