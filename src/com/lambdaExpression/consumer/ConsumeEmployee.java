package com.lambdaExpression.consumer;

import java.util.function.Consumer;

import com.lambdaExpression.predicate.Employee;

public class ConsumeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Consumer<Employee> e=emp->
        {
        	System.out.println("Employee Name:"+emp.name);
        	System.out.println("Employee Name:"+emp.age);

        };
        Employee e1=new Employee("Durga",60);
        e.accept(e1);
	}

}
