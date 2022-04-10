package com.oops2;

public class HSBCBank implements USBank {

// If a class is implementing any Interface, then its mandatory to define/override all the methods of interface
	public void credit() {
		System.out.println("hsbc-----credit");
	}

	public void debit() {
		System.out.println("hsbc --------debit");
	}

	public void transferMoney() {
		System.out.println("hsbc----------transferMoney");
	}

	public void educationLoan() {
		System.out.println("hasbc==========education");
	}

	public void carLoan() {
		System.out.println("hsbc--------------car");
	}

}
