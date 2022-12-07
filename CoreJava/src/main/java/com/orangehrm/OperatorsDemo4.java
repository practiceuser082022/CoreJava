package com.orangehrm;

public class OperatorsDemo4 {

	public static void main(String[] args) {
		
		// >, >= , < , <=, == , !=  Relation operators
		
		int a=20, b=10, c=10;
		
		boolean flag;
		
		flag= a > b;
		System.out.println(flag); // true
		
		flag= a < b;
		System.out.println(flag); // false
		
		flag= a>= b;
		System.out.println(flag); // true
		
		
		flag= a<= b;
		System.out.println(flag); // false
		
		
		flag= c >= b; // true
		System.out.println(flag); // true
		
		flag= c <= b; // true
		System.out.println(flag); // true
		
		flag= c==b ;
		System.out.println(flag); // true
		
		flag= a!=b ; 
		System.out.println(flag); // true
		
		
		flag= c!=b; 
		System.out.println(flag); // false
		
		
		
	}
}
