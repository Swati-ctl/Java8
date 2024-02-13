package com.lambdaExpression;

@FunctionalInterface
interface CalculatorInterface {
	public int calculate(int a, int b);
}
public class Calculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CalculatorInterface add = (a, b) -> a + b;
       System.out.println("Addition: " + add.calculate(10, 20));
       CalculatorInterface sub = (a, b) -> a - b;
       System.out.println("Subtraction: " + sub.calculate(30, 20));
       CalculatorInterface mul = (a, b) -> a * b;
       System.out.println("Multiplication: " + mul.calculate(7, 20));
       CalculatorInterface div = (a, b) -> a / b;
       System.out.println("Division: " + div.calculate(84,3));
	}


}