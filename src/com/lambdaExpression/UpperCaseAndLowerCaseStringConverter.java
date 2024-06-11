package com.lambdaExpression;

import java.util.ArrayList;

interface UpperCaseAndLowerCaseString {
	ArrayList<String> convert(ArrayList<String> s);
}
public class UpperCaseAndLowerCaseStringConverter {
    public static void main(String args[])
    {
		ArrayList<String> stringList=new ArrayList<String>();
        stringList.add("Hello");
        stringList.add("World");
        
    	UpperCaseAndLowerCaseString ulc=(s)->
    	{
    		ArrayList<String> upperCase=new ArrayList<String>();
    		for(String str:s)
    		{
    			upperCase.add(str.toUpperCase());
    		}
    		return upperCase;
    	};
    	UpperCaseAndLowerCaseString ull=(s)->
    	{
    		ArrayList<String> LowerCase=new ArrayList<String>();
    		for(String str:s)
    		{
    			LowerCase.add(str.toLowerCase());
    		}
    		return LowerCase;
    	};
    	System.out.println(ulc.convert(stringList));
    	System.out.println(ull.convert(stringList));
    	
    	stringList.replaceAll(s->s.toUpperCase());
    	stringList.replaceAll(s->s.toLowerCase());
    }
}
