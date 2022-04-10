package com.collections;

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String[] args) {
	
	int a[] = new int[3];  // Static array = size is fixed
	
	
	//dynamic array ---- Array list
	//1. can contain duplicate values
	//2.maintain insertion order
	//3. Synchronized
	//4.allow random access 

	
	ArrayList ar = new ArrayList();
	
	ar.add(10);// 0
	ar.add(20);// 1
	ar.add(30);// 2
	
	
	System.out.println(ar.size());
	
	ar.add(40);// 3
	ar.add(50);// 4
	ar.add(12.33);
	ar.add("test");
	ar.add('a');
	ar.add(true);
	
	System.out.println(ar.size());
	
	System.out.println(ar.get(4));
	
	
	// to print all the values from arraylist
	// 1. for loop
	// 2. using iterator
	
	
	for (int i = 0; i < a.length; i++) {
		
	System.out.println(ar.get(i));

	}
	
	// non generic vs generic
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	
	ar1.add(100);
	//ar1.add("Selenium");
	
	ArrayList<String> ar2 = new ArrayList<String>();
	ar2.add("Selenium");
	
	
	
	
	
	}	

}
