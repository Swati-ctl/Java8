package com.lambdaExpression.predicate;

import java.util.function.Predicate;

public class PredicateStringArrayNameCheck {
   public static void main(String args[])
   {
	   String names[]= {"Durga","Sunny","Bunny","Chinny"};
	   Predicate<String[]> p=s->
	   {
		   boolean flag=false;
		   
			for (String s1 : s) {
				if (s1.equals("Durga")) {
					flag = true;
				}
			}
			return flag;
	   };
	   System.out.println(p.test(names));
   }
}
