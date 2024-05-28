package com.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(25);
		Comparator<Integer> c=(a,b)->(a<b)?-1:(a>b)?1:0;
        Collections.sort(al,c);
        System.out.println(al);
	}

}
