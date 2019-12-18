package com.changyonglei;

public class E53 {

	public static void main(String[] args) {
		String s="abcd我iu12爱ja你ijp中ga国bg12c.jpg";
		String s2="";
		if (s.startsWith("ab")) {
			System.out.println("这个字符串是以ab开头的");
		}
		if (s.endsWith("jpg")) {
			System.out.println("这个字符串是以jpg结尾的");
		}
		if (s.contains("ai")) {
			System.out.println("这个字符串包含子字符串ai的");
		}
		if (s.isEmpty()) {
			System.out.println("这个字符串是空的的");
		}
		else
		{
			System.out.println("s1这个字符串不是空的");
		}
		if(s.equals(s2)){
			System.out.println("这两个字符串的值相等");
		}
		else {
			System.out.println("s1和s2这两个字符串的值不相等");
		}
		if (s2.isEmpty()) {
			System.out.println("s2这个字符串是空的的");
		}
		
		//将字符串打碎成为字符数组
		char[] str=s.toCharArray();
		for (int i = 0; i < str.length; i++) {
			char c = str[i];
			if (i==str.length-1) {
				System.out.print(str[i]+"");
			}
			else
				System.out.print(str[i]+",");
		}
		
		char[] zfsz=s.toCharArray();
		System.out.println();
		System.out.print("输出这个字符串中的数字");
		//冒号前面是集合或者数组里的单个元素，冒号后面是集合或者数组 
		for(char zf:zfsz) {
			if (zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		
		char[] zfsz1=s.toCharArray();
		System.out.println();
		System.out.println("输出这个字符串中的汉字：");
		//冒号前面是集合或者数组里的单个元素，冒号后面是集合或者数组 
		for(char zf:zfsz) {
			if (zf>='\u4E00'&&zf<='\u9FBF') {
				System.out.print(zf);
			}
		}
	}

}
