package com.leimingputongfangfa;
@FunctionalInterface
interface Printable{
	void print(StringUtils su,String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E27 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		printUpper(new StringUtils(),"Hello",(object,t)->object.printUpperCase(t));
		printUpper(new StringUtils(),"word",StringUtils::printUpperCase);
	}

	private static void printUpper(StringUtils su, String text, Printable pt) {
		// TODO 自动生成的方法存根
		pt.print(su,text);
	}

}
