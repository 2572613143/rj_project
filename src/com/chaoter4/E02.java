package com.chaoter4;

class Animal_1{
	public Animal_1(String name) {
		System.out.println("我是"+name);
	}
}
class Dog_1 extends Animal_1{
	public Dog_1(){
		super("辛巴");
	}
}
public class E02 {
	public static void main(String[] args) {
		Dog_1 dog =new Dog_1();
	}
}

