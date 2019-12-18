package com.jihe;

import java.util.TreeSet;

class Teacher implements Comparable<Object>{
	String name;
	int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString() {
	return name+":"+age;
	}
	@Override
	public int compareTo(Object o) {
		Teacher s=(Teacher)o;
		if (this.age-s.age>0) {
			return 1;
		}
		if (this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}	
}

public class T6_12 {

	public static void main(String[] args) {
	TreeSet<Teacher>	ts=new TreeSet<Teacher>();
		ts.add(new Teacher("jack", 19));
		ts.add(new Teacher("Rose", 18));
		ts.add(new Teacher("Tom", 19));
		ts.add(new Teacher("Rose", 18));
		System.out.println(ts);
	}
}
