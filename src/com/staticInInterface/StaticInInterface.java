package com.staticInInterface;

interface Interf{
	public static void m1()
	{
		System.out.println("Static method in Interface");
	}
}
public class StaticInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Interf.m1();
	}

}

// Output: Static method in Interface
// Explanation: In Java 8, we can define static methods in interface.
// We can access the static method of interface using interface name only.
// We can't access the static method of interface using implementation class object (very important)

