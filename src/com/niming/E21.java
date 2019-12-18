package com.niming;
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
class Cat implements Animal{

	@Override
	public void shout() {
		// TODO 自动生成的方法存根
		System.out.println("喵喵");
	}
	
}
public class E21 {

	public static void main(String[] args) {
		
		Cat cat=new Cat();
		cat.shout();
		String name="小花";
		animalShout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println(name+"喵喵！");
				
			}
		});
		animalShout(()->System.out.println("哦呜"));
		showSum(10,30,(x,y)->x+y);
	}
	
	private static void animalShout(Animal animal) {
		animal.shout();
	}
	private static void showSum(int i,int j,Calculate c) {
		System.out.println(i+"+"+j+"的和是"+c.sum(i, j));
	}

}
