package com.lambdaExpression.binaryoperator;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class PrimitiveBinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator i = (a, b) -> a * b;
		System.out.println(i.applyAsInt(5, 6));
		DoubleBinaryOperator d = (a, b) -> a / b;
		System.out.println(d.applyAsDouble(17, 5));
		LongBinaryOperator l = (a, b) -> (a * b) * 987;
		System.out.println(l.applyAsLong(23, 14));
	}
}
