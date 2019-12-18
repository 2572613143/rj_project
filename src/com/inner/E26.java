package com.inner;

@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class E26 {
	private static void printName(String name, PersonBuilder sp) {
		System.out.println(sp.buildPerson(name).getName());
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		printName("张学友",name->new Person(name));
		printName("张宝英",Person::new);
	}



}
