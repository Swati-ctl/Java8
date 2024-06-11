package com.lambdaExpression.function;

import java.util.function.Function;

public class FunctionUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Function<String,String> f=s->s.toUpperCase();
     System.out.println(f.apply("Sayesha"));
	}

}
