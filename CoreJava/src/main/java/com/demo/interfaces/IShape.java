package com.demo.interfaces;

public interface IShape {

	public static final float PI=3.141f;
	
	public abstract void fun1();
	public void fun2();
	
	default void fun3() {
		System.out.println("default method");
	}
	
	public static void fun4() {
		System.out.println("static method");
	}
}
