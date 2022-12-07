package com.orangehrm;

public class OperatorsDemo5 {

	public static void main(String[] args) {
		
		
		// logical operators &&, || , !
		
		boolean flag1, flag2 , flag3;
		
		System.out.println(" && table ");
		flag1= true && true; // true
		System.out.println(flag1);
		flag1= true && false; // false
		System.out.println(flag1);
		flag1= false && true; // false
		System.out.println(flag1);
		flag1= false && false; // false
		System.out.println(flag1);
		
		System.out.println(" || table ");
		flag2= true || true; // true
		System.out.println(flag2);
		flag2= false || true; // true
		System.out.println(flag2);
		flag2= true || false; // true
		System.out.println(flag2);
		flag2= false || false; // false
		System.out.println(flag2);
		
		flag3= true;
		System.out.println(flag3); // true
		
		System.out.println(!flag3); // false

	}

}
