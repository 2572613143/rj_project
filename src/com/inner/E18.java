package com.inner;

import com.inner.Outer.Inner;

//外部类
class Outer{
	static int m=0;
	static void test1() {
		System.out.println("外部类成员方法");
	}

//成员内部类
	static class Inner{
	int n=1;
	void show1() {
		System.out.println("外部类成员变量m="+m);
		test1();
	}
	void show2() {
		System.out.println("内部类成员方法");
	}
}
//定义外部类方法，访问内部类变量和方法
void test2(){
	
	Inner inner=new Inner();
	System.out.println("内部类成员变量n="+inner.n);
	inner.show2();
}
}
public class E18 {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.test2();
		Outer.Inner inner=new Outer.Inner();
		inner.show1();
	}
}
