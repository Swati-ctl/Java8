package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student{
	 String name;
	 int marks;
	 Student(String name, int marks)
	 {
			this.name = name;
			this.marks = marks;
	 }
}

public class StreamMapOnNonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> s= new ArrayList<Student>();
		s.add(new Student("Sayesha", 100));
		s.add(new Student("Swati", 67));
		s.add(new Student("Amit", 25));
		s.add(new Student("Kiran", 45));
		Function<Student,String> f = (stu)->{
            if(stu.marks>=80)
            {
               return stu.name=stu.name+"[Distinction]";
            }
            else if(stu.marks >=60)
            {
            	return stu.name=stu.name+"[First Class]";
            }
            else if (stu.marks >= 35) {
            	return stu.name=stu.name+"[Second Class]";
            } else {
            	return stu.name=stu.name+"[fail]";
            }

        };
		s.stream().map(f).collect(Collectors.toList()).forEach(System.out::println);
		
		s.stream().map((student)->
		{
            if(student.marks>=80)
            {
               return student.name=student.name+"[hello]";
            }
            else if(student.marks >=60)
            {
            	return student.name=student.name+"[Hi]";
            }
            else if (student.marks >= 35) {
            	return student.name=student.name+"[how are you]";
            } else {
            	return student.name=student.name+"[Welcome]";
            }
		}
).collect(Collectors.toList()).forEach(System.out::println);
	}

}
