package com.demo.string;

public class StringReverse {

	public static void main(String[] args) {
	
		String name="Java";
		
		char ch[]=name.toCharArray();
		
		for(int i=0;i<=name.length()-1;i++) {
			System.out.print(ch[i]);
		}

		System.out.println();
		
		for(int j=name.length()-1;j>=0;j--) {
			System.out.print(ch[j]);
		}
	}

}
