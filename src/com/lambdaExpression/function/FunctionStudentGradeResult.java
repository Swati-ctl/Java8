package com.lambdaExpression.function;

import java.util.function.Function;

import com.lambdaExpression.predicate.Employee;

public class FunctionStudentGradeResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Student,String> f=e->
		{
			int marks=e.marks;
			if(marks>=80)
			{
				return "A[Distinction]";
			}
			else if(marks >=60)
			{
				return "B[First Class]";
			}
			else if (marks >= 35) {
				return "C[Second Class]";
			} else {
				return "D[fail]";
			}
		};
		
		System.out.println(f.apply(new Student("Swati",100)));
		System.out.println(f.apply(new Student("Amit",25)));

	}

}
