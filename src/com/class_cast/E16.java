package com.class_cast;
interface Animal{
	void shout();

//	void eatMan();
}
class Tiger implements Animal{

	@Override
	public void shout() {
		// TODO 自动生成的方法存根
		System.out.println("aow……");
	}
	public void eatMan() {
		// TODO 自动生成的方法存根
		System.out.println("老虎吃人了");
	}
	
}
class Pig implements Animal{

	@Override
	public void shout() {
		System.out.println("hengheng……");
		
	}
	
}
public class E16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Animal tiger=new Tiger();
//		tiger.shout();
//		Tiger tiger1=(Tiger)tiger;
//		tiger1.eatMan();
		
		Animal an1=new Tiger();
		if(an1 instanceof Tiger) {
			Tiger tiger1=(Tiger)tiger;
			tiger1.eatMan();
			tiger.shout();
		}
		else {
			System.out.println("这个动物不是老虎");
		}
	}

}
