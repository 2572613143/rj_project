package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputStream_test {

	public static void main(String[] args) throws Exception {
		FileInputStream in=new FileInputStream("test_.txt");
		FileOutputStream out=new FileOutputStream("out_.txt");
		String str=",world";
		int b=0;
		while ((b=in.read())!=-1) {
			System.out.print((char)b);
			out.write(b);
		}
		out.write(str.getBytes());
		out.close();
		in.close();
		
	}

}
