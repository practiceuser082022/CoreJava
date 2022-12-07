package com.arrays.demo;

public class ArrayLoopsDemo {

	public static void main(String[] args) {
		
		String a[]=new String[5];
		
		a[0]="Java";
		a[1]="Python";
		a[2]="HTML";
		a[3]="CSS";
		a[4]="Cucumber";
		
		
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.println(a[i]);
		}
		
		
		for(String n: a) {
			
			System.out.println(n);
		}
		
	}
}
