package com.demo.interfaces;

public class CItest implements ITest.Yes{

	@Override
	public void show() {
		System.out.println("method implemented");
		
	}

	public static void main(String[] args) {
		
		CItest c=new CItest();
		
		c.show();
	}
}
