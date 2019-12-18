package com.chaoter4;
class Animal{
	//filed成员变量
	String name;
	void shout() {
		System.out.println("动物发出叫声");
	}
}
class Dog extends Animal{
	//方法重写
	@Override
	void shout() {
		System.out.println("汪汪.....");
	}
	//继承了animal类所有的成员变量和成员方法
	public void printName() {
		System.out.println("name="+name);
	}
}
public class E01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		dog.name="哈士奇";
		dog.printName();
		dog.shout();
	}

}
