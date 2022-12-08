package com.methods.demo;

public class OverloadingDemo {

	public void add(int x, int y) {
		
		System.out.println(x + y);
	}
	
	
	public void add(float a,float b) {
		
		System.out.println(a + b);
		
	}
	
	
	public void add(int x, int y,int z) {
		
		System.out.println(x + y+z);
	}
	
	
	public static void main(String[] args) {
		
		OverloadingDemo od=new OverloadingDemo();
		
		od.add(10.50f, 20.45f);
		od.add(2, 3);
		od.add(22, 34,45);
	}

}
