package com.mainmethod;

interface Interf
{
	public static void main(String args[])
	{
		System.out.println("Interface main method");
	}
}	
public class InterfaceMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
// Output: Interface main method
// Explanation: from Java 8 we can write main method inside interface. It is not mandatory to write main method inside class.
// This feature is introduced to provide security to the main method. We can't call interface main method directly from command prompt.
// We can call interface main method from another class main method.
// We can't call interface main method directly from command prompt. We can call interface main method from another class main method.