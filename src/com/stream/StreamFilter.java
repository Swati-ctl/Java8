package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> l= Arrays.asList(5,10,7,30,15,20);
     List<Integer> result=l.stream().filter(i->i%2==0).collect(Collectors.toList());
     result.forEach(System.out::println);
     l.stream().filter(i->i>7).forEach(System.out::println);
	}

}