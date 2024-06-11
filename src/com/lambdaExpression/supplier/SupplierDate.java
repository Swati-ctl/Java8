package com.lambdaExpression.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}
