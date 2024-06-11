package com.lambdaExpression.predicatejoining;

import java.util.function.Predicate;

public class PredicateEvenORGreaterCheck {
 
	public static void main(String args[])
	{
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		System.out.println(p1.or(p2).test(20));
		System.out.println(p1.or(p2).test(15));
		System.out.println(p1.or(p2).test(7));
	}
}
