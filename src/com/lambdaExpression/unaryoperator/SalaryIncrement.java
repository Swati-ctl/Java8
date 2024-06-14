package com.lambdaExpression.unaryoperator;

import java.util.function.UnaryOperator;

class Employee
{
	int salary;
	String name;

	Employee(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
}
public class SalaryIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     UnaryOperator<Employee> u = e->
     {
    	 e.salary=e.salary+10000;
		return e;
    	 
     };
     Employee e=new Employee(10000,"Sayesha");
     System.out.println("Employee Name:"+u.apply(e).salary);
	}

}
