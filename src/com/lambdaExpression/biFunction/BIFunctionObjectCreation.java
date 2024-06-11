package com.lambdaExpression.biFunction;

import java.util.function.BiFunction;

import com.lambdaExpression.predicate.Employee;

public class BIFunctionObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String, Integer, Employee> f = (a, b) -> new Employee(a, b);
		Employee e = f.apply("Sayesha", 100);
		Employee e1 = f.apply("Swati", 67);
		System.out.println((e.name + " " + e.age));
	}
}
