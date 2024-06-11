package com.lambdaExpression.predicatejoining;

import java.util.function.Predicate;

public class PredicateNegateEvenCheck {
   public static void main(String args[])
   {
	   Predicate<Integer> p=i->i%2==0;
	   System.out.println(p.negate().test(4));
   }
}
