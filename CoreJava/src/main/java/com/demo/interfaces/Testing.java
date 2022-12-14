package com.demo.interfaces;

public class Testing implements Test.Yes{

	@Override
	public void show() {
	
			System.out.println("Hello World!");
		
	}
	
	public static void main(String[] args) {
		
		Testing t=new Testing();
		
		t.show();
	}

}
