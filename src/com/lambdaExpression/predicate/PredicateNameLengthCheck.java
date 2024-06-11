package com.lambdaExpression.predicate;

import java.util.function.Predicate;

public class PredicateNameLengthCheck {
   public static void main(String args[])
   {
	   Predicate<Employee> p=e->e.name.length()>5;
	   System.out.println(p.test(new Employee("Durgawati",60)));
   }
}
