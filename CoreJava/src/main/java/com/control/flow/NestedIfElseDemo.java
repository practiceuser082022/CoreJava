package com.control.flow;

public class NestedIfElseDemo {

	public static void main(String[] args) {

		int a=20,b=40,c=10,d=20;
		
		if (b>a) {
			
			if(d>c) {
				System.out.println("d is bigger than c");
			}else {
				System.out.println("c is bigger than d");
			}
			
		} else {
			
			System.out.println("a is bigger");
		}

		
		
		if (a>b) {
			
			System.out.println("a is bigger");
			
		} else {
			
			if(d>c) {
				System.out.println("d is bigger than c");
			}else {
				System.out.println("c is bigger than d");
			}
		}
	}

}
