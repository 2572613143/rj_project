package com.changyonglei;

public class E54 {
	public static void main(String[] args) {
		String s1="java";
		System.out.println("s1转换成大写之后是"+s1.toUpperCase());
		System.out.println("整数12转换成字符串之后是"+String.valueOf(12));
	
		String s2="          http://localhost  : 8080   ";
		System.out.println("字符串去掉所有的空格以后是"+s2.replace(" ",""));
		System.out.println("字符串去掉前后两端的空格以后是"+s2.trim());
		//第一一斜杠是为了表示第二个斜杠是一个斜杠
		System.out.println("字符串去掉所有的空格以后是"+s2.replaceAll("\\S",""));
	}
}
