package com.lambdaExpression;

public class LambdaWithThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Runnable r= ()->
       {
    	  for(int i=0;i<5;i++)
    	  {
    		  System.out.println("Child Thread");
    	  }
       };
       Thread t=new Thread(r);
       t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Another Main Thread");
		}
	}

}
