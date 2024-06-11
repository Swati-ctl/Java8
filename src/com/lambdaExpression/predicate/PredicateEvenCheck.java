package com.lambdaExpression.predicate;

import java.util.function.Predicate;

public class PredicateEvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p= i->i%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));


	}

}
