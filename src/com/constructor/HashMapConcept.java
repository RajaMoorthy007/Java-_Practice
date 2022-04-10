package com.constructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.collections.Employee;

public class HashMapConcept {

	public static void main(String[] args) {

		//HashMap is a class implements Map Interface
		//extends  AbstractMap
		// it contains only unique elements
		//stores the value-- key and value pair
		//it may have one null key and multiple null value
		// its maintains no order
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "OTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(hm);
		
		hm.remove(3);
		
		System.out.println(hm);
		
		
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Tom",25, "admin");
		Employee e2 = new Employee("RAJA",26, "QA");
		Employee e3 = new Employee("MUTHU",16, "Devs");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		
		// transverse the hashmap
	
			
		}



		
		
		
		
		
		
		
		
		
		
		
	}

}
