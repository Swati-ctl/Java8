package com.lambdaExpression.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateOnEmployeeAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();
		populate(al);
		Predicate<Employee> p = e -> e.age > 30;
		for (Employee e : al) {
			if (p.test(e)) {
				System.out.println(e.name);
			}
		}
	}

	public static void populate(ArrayList<Employee> al) {
		al.add(new Employee("Durga", 60));
		al.add(new Employee("Sunny", 21));
		al.add(new Employee("Bunny", 25));
		al.add(new Employee("Chinny", 35));
		al.add(new Employee("Vinny", 28));
	}
}
