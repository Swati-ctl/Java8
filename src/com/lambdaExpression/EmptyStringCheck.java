package com.lambdaExpression;

import java.util.function.Predicate;

interface EmptyString {
	boolean check(String s);
}
public class EmptyStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmptyString es=s->s.isEmpty();
		System.out.println(es.check(""));
		System.out.println(es.check("Hello"));
		
		Predicate<String> ps=s->s.isEmpty();
		System.out.println(ps.test(""));
		System.out.println(ps.test("Thanks Everyone"));
	}

}
