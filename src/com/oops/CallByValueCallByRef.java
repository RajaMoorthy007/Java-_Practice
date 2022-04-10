package com.oops;

public class CallByValueCallByRef {
	
	
	int p;
	int q;
	

	public static void main(String[] args) {

		CallByValueCallByRef obj = new CallByValueCallByRef();
		int x =10;
		int y =20;
		obj.testSum(x,y);  //call by valuer pass by value
		
		obj.p=50;
		obj.q=60;
	}
	
	public int testSum(int a, int b) {
		a = 30;
		b=40;
		int c = a+b;
		return c;
	}

	
	public void swap() {
		
	}
}
