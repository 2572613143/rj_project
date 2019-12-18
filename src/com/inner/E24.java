package com.inner;
//定义函数式接口
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
//定义测试类
public class E24 {
	private static void printUpper(String text,Printable pt) {
		pt.print(text);
	}
	public static void main(String[] args) {
		
		StringUtils stu=new StringUtils();
		//使用lambda表达方式
		printUpper("Hello",t->stu.printUpperCase(t));
		//使用方法引用的方式
		printUpper("world",stu::printUpperCase);
	}

}
