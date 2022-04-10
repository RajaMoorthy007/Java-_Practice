package com.oops;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		// one object will be created and obj is the reference variable
		//after creating the object ,the copy of all non static method will be given to this object

		obj.test();

		int l = obj.pqr();
		System.out.println(l);

		String se = obj.qa();
		System.out.println(se);

		int d1 =obj.division(30, 10);
		System.out.println(d1);
		
		// main method is void ---> never return a value

	}


	// non static methods

	// void -----does not return any value
	// return type--------- void
	public void test() { // no input , no output
		System.out.println("test method");
	}

	//return type = int
	public int pqr() { // no input, some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;

		return c;

	}

	//return type ------>String

	public String qa() { // no input, some output
		System.out.println("oa method");
		String s = "selenium";

		return s;
	}

	//return type ---> int
	// x,y-----> input paramaeter
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;

		return d;
	}








}