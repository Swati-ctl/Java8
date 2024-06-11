package com.lambdaExpression.functionchaining;

import java.util.function.Function;

public class FunctionTwiceAndCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f1 = i -> i * 2;
		Function<Integer, Integer> f2 = i -> i * i * i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));

	}
}
