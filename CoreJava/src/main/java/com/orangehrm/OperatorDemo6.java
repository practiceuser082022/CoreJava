package com.orangehrm;

public class OperatorDemo6 {
	
	public static void main(String[] args) {
		
		int a=20,b=10, c=40, d=30;
		
		boolean flag= a > b && c > d;
		System.out.println(flag);
		
		boolean flag1= ( a > b ) && ( c > d );
		System.out.println(flag1);
		
	}

}
