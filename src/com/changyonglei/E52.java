package com.changyonglei;

public class E52 {

	public static void main(String[] args) {
		String s="abcdiu12jcijpgabg12c.jpg";
		System.out.println("输出字符串的长度为"+s.length());
		System.out.println("字符串中第一个字符"+s.charAt(0));
		System.out.println("字符串中第二个字符"+s.charAt(1));
		System.out.println("字符串中第仨个字符"+s.charAt(2));
		System.out.println("字符串中第四个字符"+s.charAt(3));
		//a='97' A='65' 0='48'
		System.out.println("字符串中c第一次出现的位置"+s.indexOf('c'));
		System.out.println("字符串中c最后一次出现的位置"+s.lastIndexOf('c'));
		
		System.out.println("子字符串第一次出现的位置"+s.indexOf("jpg"));
		System.out.println("字符串中最后一次出现的位置"+s.lastIndexOf("jpg"));

		
	}

}
