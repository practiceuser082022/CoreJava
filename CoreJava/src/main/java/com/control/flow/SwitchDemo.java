package com.control.flow;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int marks=60;
		
		// byte, short, int , char, String, enum
		
		switch(marks) {
		
		case 90: 
			 System.out.println("Grade A");
			 break;
		
		case 70: 
			 System.out.println("Grade B");
			 break;
		
		case 60: 
			 System.out.println("Grade B");
			 break;
			 
			 
		case 40: 
			 System.out.println("Grade C");
			 break;
			 
		default: 
		 
			 System.out.println("Failed");
		}
		
		System.out.println("out side of switch");
	}

}
