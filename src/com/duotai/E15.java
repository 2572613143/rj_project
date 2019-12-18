package com.duotai;
abstract class Animal{
	abstract void shout();
}
class dog extends Animal{

	@Override
	public void shout() {
		System.out.println("汪汪");
	}
}
class cat extends Animal{

	@Override
	public void shout() {
		System.out.println("喵喵");
	}
}
public class E15 {

	public static void main(String[] args) {

		Animal dog=new dog();
		dog.shout();
		Animal cat=new cat(); 
		cat.shout();

	}

}
