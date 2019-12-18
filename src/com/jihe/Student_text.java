package com.jihe;

import java.util.HashSet;



class Student{
	String id;
	String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id+":"+name;
	}
}
public class Student_text {
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		Student stu1=new Student("1", "Jack");
		Student stu2=new Student("2", "Rose");
		Student stu3=new Student("2", "Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);

	}

}
