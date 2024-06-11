package com.lambdaExpression.function;

import java.util.function.Function;

public class FunctionStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Swati"));
		System.out.println(f.apply("Shailesh"));
		System.out.println(f.apply("Sayesha"));

	}

}
