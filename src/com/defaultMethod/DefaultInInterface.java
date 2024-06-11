package com.defaultMethod;

interface Left {
	default void m1() {
		System.out.println("Left Interface");
	}
}
interface Right{
	default int m2() {
		System.out.println("Right Interface");
		return 0;
	}
}

public class DefaultInInterface implements Left, Right {

	public void callingDefaultMethod() { // TODO Auto-generated method stub
		Left.super.m1();
	}

	public void m1() {
		System.out.println("Implementing m1 method in DefaultInInterface class");
	}
    public int m2() {
     System.out.println("Implementing m2 method in DefaultInInterface class");
     return 2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultInInterface d = new DefaultInInterface();
		d.callingDefaultMethod();
		d.m1();

		Left l = new DefaultInInterface();
		l.m1(); //calls class m1 method
        System.out.println("the Right interface method is: "+d.m2());
	}

}

//Notes:  We can implement default method in the implementation class but it must be the
//public method
