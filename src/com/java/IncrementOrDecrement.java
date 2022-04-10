package com.java;

public class IncrementOrDecrement {

	public static void main(String[] args) {

		// ++
		//--
		int i = 1;
		int j= i++; // post increment
		System.out.println(i);
		System.out.println(j);

		System.out.println("**************");
		
		
		int a = 2;
		int b = ++a; //  pre Increment
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("**************");

		int m = 2;
		int n= m--; // post decrement
		System.out.println(m);
		System.out.println(n);
		
		
		System.out.println("**************");


		int c =2;
		int d =--c;
		System.out.println(c);
		System.out.println(d);
	}
}
