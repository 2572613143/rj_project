package com.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_ {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Path path=Paths.get("相对定位_test.html");
		System.out.println("这个路径的根路径是"+path.getRoot());
		System.out.println("这个路径的父路径是"+path.getParent());
		System.out.println("这个路径的名称数是"+path.getNameCount());
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println("索引为"+i+"的路径名称是"+path.getName(i));
		}
		System.out.println("这个路径的URI路径是"+path.toUri());
		System.out.println("这个路径的绝对路径是"+path.toAbsolutePath());
	}

}
