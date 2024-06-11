package com.lambdaExpression.predicatejoining;

import java.util.function.Predicate;

public class PredicateEvenAndGreaterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Predicate<Integer> p1=i->i%2==0;
      Predicate<Integer> p2=i->i>10;
      System.out.println(p1.and(p2).test(20));
      System.out.println(p1.and(p2).test(15));

      System.out.println(p1.and(p2).test(7));

	}

}
