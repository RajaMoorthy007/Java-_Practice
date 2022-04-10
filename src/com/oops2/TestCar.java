
package com.oops2;

public class TestCar {

	public static void main(String[] args) {

		//Static Polymorphism or Compile time polymorphism
		Bmw b= new Bmw();
		b.start();
		b.start();
		b.refuel();
		b.thiefSafety();
		b.engine();



		System.out.println("********************");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();

		System.out.println("**************");

		// Top casting 
		Car c1 =new Bmw(); // child object can be referred by parent class reference variable----dynamic polymorphism or rum time polymorphism

		c1.start();
		c1.stop();
		c1.refuel();



		// Down casting
		Bmw b1=(Bmw) new Car(); // Class Cast Exception

	}
}
