package com.abstractclass.demo;

public abstract class ABCDemo {

	public ABCDemo() {
		System.out.println("constructor");
	}
	
	public abstract void fun1(); // declaration , not have implementation
	
	
	public void fun5() {
		System.out.println("instance method");
	}
	
	public static void fun2() {
		System.out.println("static method");
	}
	
	public final void fun3() {
		System.out.println("final method");
	}
	
	
}
