package com.oops2;

public class TestBank {

	public static void main(String[] args) {

		
	//	USBANk us = new USBank();
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		
		//dynamic Polymorphism
		//child object object an be reffered by parent interface var
		
	USBank us	=new HSBCBank();
	us.credit();
	us.debit();
	us.transferMoney();
	}

}
