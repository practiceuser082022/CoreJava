package com.methods.demo;

public class Calculate2 {
	
	int x=10,y=20;
	

	public int addNumbers() {
		
		
		return x + y;
	
	}
	
	
	public static void main(String[] args) {
	
		float result=0;
		Calculate2 c=new Calculate2();
		result=c.addNumbers();
	
		System.out.println(result);
		
	}

}
