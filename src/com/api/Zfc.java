package com.api;

public class Zfc {

	public static void main(String[] args) {
		String zfc=new String("HelloWorld");
		for (int i = zfc.length()-1; i>=0 ; i--) {
			if (zfc.charAt(i)>='a'&&zfc.charAt(i)<='z') {
				System.out.print((char)(zfc.charAt(i)-32));
			}
			else if(zfc.charAt(i)>='A'&&zfc.charAt(i)<='Z'){
				System.out.print((char)(zfc.charAt(i)+32));
			}
		}
	}

}
