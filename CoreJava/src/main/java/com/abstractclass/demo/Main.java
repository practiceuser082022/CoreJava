package com.abstractclass.demo;

public class Main extends ABCDemo {

	public static void main(String[] args) {
		
		Main m=new Main();
		m.fun1();

	}

	@Override
	public void fun1() {
	
		System.out.println("abstract method implemented");
	}

}
