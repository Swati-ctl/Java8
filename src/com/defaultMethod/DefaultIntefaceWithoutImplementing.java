package com.defaultMethod;

interface Square {
    default void m1() {
        System.out.println("Square Interface");
    }
}

public class DefaultIntefaceWithoutImplementing implements Square {
	public void callingDefaultMethod() { // TODO Auto-generated method stub
        Square.super.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square l = new DefaultIntefaceWithoutImplementing();
	    l.m1();//need to check this 
	}

}
