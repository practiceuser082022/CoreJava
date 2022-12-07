package com.control.flow;

public class IfElseLadderDemo {

	public static void main(String[] args) {
		
		int marks=44;
		
		if( marks >=90) {
			
			System.out.println("Grade A");
			
		}else if(marks >=75) {
			
			System.out.println("Grade B");
			
		}else if(marks >= 45) {
			
			System.out.println("Grade C");
			
		}else {
			
			System.out.println("Fail");
		}
	}

}
