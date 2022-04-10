package com.java;

public class TwoDimensionalArray {

	public static void main(String[] args) {


		String s[][] = new String[3][5];

		System.out.println(s.length);  // 3-------total no of rows

		System.out.println(s[0].length); // 5----total no of coloumns

		System.out.println(s[1].length);

		//1st row
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";

		// 2nd row
		s[1][0]="A1";
		s[1][1]="B1";
		s[1][2]="C1";
		s[1][3]="D1";
		s[1][4]="E1";


		//3rd row
		s[2][0]="A2";
		s[2][1]="B2";
		s[2][2]="C2";
		s[2][3]="D2";
		s[2][4]="E2";


		System.out.println(s[1][2]);
		System.out.println(s[1][4]);
		
		//print all values of 2d array:usefor loop
		
		for (int i = 0; i < s.length; i++) {
		
		}




	}

}
