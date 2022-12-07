package com.orangehrm;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int a=20,b=10,c;
		
		boolean flag=  ( a > b ) ? true : false ;
		
		System.out.println(flag);
		
		c=  ( a < b ) ? a : b ;
		System.out.println(c);
		
		System.out.println(( a < b ) ? a : b);
	}

}
