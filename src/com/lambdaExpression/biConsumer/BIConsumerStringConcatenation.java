package com.lambdaExpression.biConsumer;

import java.util.function.BiConsumer;

public class BIConsumerStringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BiConsumer<String,String> b=(s1,s2)->System.out.println(s1+s2);
      b.accept("Sayesha", "Swati");
	}

}
