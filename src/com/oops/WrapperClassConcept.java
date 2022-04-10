package com.oops;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		
		//Data conversion : String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer,Double  ,Character, Boolean
		
		//Double to int
		String y = "12.33";
		double j = Double.parseDouble(y);
		System.out.println(j+10);
		
		//String to Boolean
		String k = "true";
		boolean parseBoolean = Boolean.parseBoolean(k);
		System.out.println(parseBoolean);
		
		//int to string conversion
		int l=200;
		System.out.println(l+20);
		
		String s = String.valueOf(l);
		
		String u ="100A";
		int m = Integer.parseInt(u); // number format exception
		System.out.println(m);
		System.out.println(s+6);
		
	}

}
