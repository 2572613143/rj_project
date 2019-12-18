package com.object;
class animals extends java.lang.Object{
	void shut() {
		System.out.println("动物叫");
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "我是一只小动物";
	}
}
public class E06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		animals dw=new animals();
		animals dw2=new animals();
		System.out.println(dw.toString());
		System.out.println(dw2.toString());
	}

}
