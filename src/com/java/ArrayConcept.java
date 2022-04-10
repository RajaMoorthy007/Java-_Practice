package com.java;

public class ArrayConcept {

	public static void main(String[] args) {

		//Array: to store a similar data types values in a array variable

		//1. int array
		// lowest index is 0
		// upper index is n-1  ( n is size of array)
		// one dimensional array

		// Disadvantages of array
		//1. size is fixed-----static array---To overcome this problem ----we use collections----ArrayList, HashTable----use dynamic array
		//2. stores only similar datatypes---To overcome this problem-----we use object array

		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;

		System.out.println(a[0]);
		System.out.println(a[2]);

		//		System.out.println(a[4]);  ---------Array Index bound out of exception

		System.out.println(a.length);  // size or length of array


		// print all the values of array : use for loop

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

		// 2. double array 
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=13.55;
		d[2]=15.33;

		System.out.println(d[2]);



		// 3. char array

		char c[] = new char[2];
		c[0]='r';
		c[1]='2';

		System.out.println(c[1]);


		//4. boolean array

		boolean b[] = new boolean[2];

		b[0]= true;
		b[1]=false;


		//5. String Array

		String s[] = new String[2];

		s[0]="test";
		s[1]="world";

		System.out.println(s[0]);

		System.out.println(s.length);



		//6. Object Array { object is class}======= is used to store different data types values

		Object ob[] = new Object[6];

		ob[0] ="Tom";
		ob[1] =25;
		ob[2] =12.33;
		ob[3] ="1/1/195";
		ob[4] ='R';
		ob[5] ="London";


		System.out.println(ob[5]);


	}

}
