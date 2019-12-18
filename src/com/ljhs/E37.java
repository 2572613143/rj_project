package com.ljhs;
class Person{
	public void finalize() {
		System.out.println("对象将被作为垃圾回收……");
	}
}
public class E37 {
	//不通知强制垃圾回收的方法
	public static void recyclegwaste1() {
		Person p1=new Person();
		p1=null;
		int i=1;
		while(i<10) {
			System.out.println("方法1循环中…");
			i++;
		}
	}
	//通知一个强制垃圾回收的方法
	public static void recyclegwaste2() {
		Person p2=new Person();
		p2=null;
		System.gc();
		int i=1;
		while(i<10) {
			System.out.println("方法2循环中…………");
			i++;
		}
	}
	public static void main(String[] args) {
		recyclegwaste1();
		System.out.println("————————————————");
		recyclegwaste2();

	}

}
