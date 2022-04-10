package com.oops;

public class StativAndNonStatic {

	// the scope of global variable will be available across all function with some condition

	String name ="Tom"; // non static global variable
	static	int age = 25; //static global variable


	public static void main(String[] args) {

		// how to call static methods and variables
		//1. direct calling
		sum();
		//2.calling by class name
		StativAndNonStatic.sum();

		System.out.println(age);
		System.out.println(StativAndNonStatic.age);


		// how to call non static methods and variables
		StativAndNonStatic obj = new StativAndNonStatic();
		obj.sendMail();
		String name2 = obj.name;
		System.out.println(name2);


		// can i access static methods by using object reference ?   yes
		obj.sum(); // warning will give


	}

	public void sendMail() {  // non static method
		System.out.println("sendmail method");
	}

	public static void sum() {  // static method

		System.out.println("sum method");
	}


}
