package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		/*InputStream jpsr=System.in;
		InputStreamReader ir=new InputStreamReader(jpsr);
		BufferedReader br=new BufferedReader(ir);*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("poem_1.txt")));
		System.out.println("请输入你的姓名");
		
		System.out.println("请输入年龄：");
		String line=br.readLine();
		bw.write("您的年龄是"+line);
		System.out.println("您的年龄是"+line);
		
		int age=Integer.parseInt(line);
		System.out.println("你明年的年龄是"+(age+1)+"岁");
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}
