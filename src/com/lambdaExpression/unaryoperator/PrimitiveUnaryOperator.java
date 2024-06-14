package com.lambdaExpression.unaryoperator;
import java.util.function.*;

public class PrimitiveUnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      IntUnaryOperator i= a->a*a;
      System.out.println(i.applyAsInt(5));
      DoubleUnaryOperator d=a->(a*a)*2;
      System.out.println(d.applyAsDouble(5.5));
      LongUnaryOperator l=a->a*3566542;
      System.out.println(l.applyAsLong(5));
	}

}
