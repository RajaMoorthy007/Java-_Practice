package com.oops;

public class LocalVsGlobalVariable {

	// Global variable or Class variable
	String name = "Tom";
	int age = 25;


	public static void main(String[] args) {

		int i =10; // local variable
		System.out.println(i);
	}


	public void sum() {


		int i = 10; // local variable
		int j = 20;
		int age = 25;

	}
}
