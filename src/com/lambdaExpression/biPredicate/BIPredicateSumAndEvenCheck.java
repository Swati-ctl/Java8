package com.lambdaExpression.biPredicate;

import java.util.function.BiPredicate;

public class BIPredicateSumAndEvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0;
        System.out.println(p.test(10,20));
        System.out.println(p.test(17,20));
	}
}
