package com.demo.interfaces;

public class CShape implements IShape {

	public static int count=10;
	
	public static void main(String[] args) {
		
		IShape is=new CShape();
		
		CShape cs=new CShape();
		
				
	}

	@Override
	public void fun1() {
		System.out.println("fun1 implemented");
		
	}

	@Override
	public void fun2() {
		
		System.out.println("fun2 implemented");
	}

	
	public void fun5() {
		System.out.println("fun5 from CShape");
	}
}
