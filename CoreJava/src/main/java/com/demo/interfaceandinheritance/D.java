package com.demo.interfaceandinheritance;

public class D extends C{

	@Override
	public void fun2() {
	
		System.out.println("fun2");
	}

	
	public static void main(String[] args) {
		
		D d=new D();
		
		d.fun1();
		d.fun2();
		
		IA ia=new D();
		ia.fun1();
		ia.fun2();
		
		IB ib=new D();
		ib.fun1();
		ib.fun2();
	}
}
