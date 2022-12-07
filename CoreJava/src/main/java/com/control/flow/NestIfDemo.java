package com.control.flow;

public class NestIfDemo {

	public static void main(String[] args) {
		
		
		int a=20,b=10, c=5;
		
		if (b > c) {  // --> outer if
			
			if( b < a) { // --> nested if
				
				System.out.println("b is smaller than a");
				
			}
			
			System.out.println("b is bigger than c");
		}
	}

}
