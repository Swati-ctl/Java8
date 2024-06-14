package com.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
    public static void main(String args[])
    {
    	List<String> l= Arrays.asList("Syaesha","Swati","Shailesh","Saibaba");
    	l.stream().map(i->i.toUpperCase()).forEach(System.out::println);
    	l.stream().map(i->i.toLowerCase()).forEach(System.out::println);
    }
}
