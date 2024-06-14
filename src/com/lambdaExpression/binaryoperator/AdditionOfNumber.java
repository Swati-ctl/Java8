package com.lambdaExpression.binaryoperator;

import java.util.function.BinaryOperator;

public class AdditionOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BinaryOperator<Integer> b= (a,c)->a+c;
      System.out.println(b.apply(10, 20));
	}

}
