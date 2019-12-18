package com.abstart;

public class PersonModel {
	String name;
	String sex;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonModel(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
