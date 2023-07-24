package com.app.pojos;

import java.util.HashSet;
import java.util.Set;

public class LombokTester {

	public static void main(String[] args) {
		Employee eobj = new Employee(1, "Rushabh", "powai", "98989899");
		Employee eobj1 = new Employee(23,"Steve", "California", "4988989");
		
		Set<Employee>myset =new HashSet<>();
		myset.add(eobj);
		myset.add(eobj1);
		for(Employee e : myset ) {
			System.out.println(e.getId()+"--"+e.getName() +"--"+e.getAddress()+"--"+e.getMobileno());
		}
	}

}
