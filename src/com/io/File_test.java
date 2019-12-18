package com.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
public class File_test {

	public static void main(String[] args) {
		File file=new File("poem_1.txt");
		System.out.println("文件名称:"+file.getName());
		System.out.println("文件相对路径:"+file.getPath());
		System.out.println("文件绝对路径:"+file.getAbsolutePath());
		System.out.println("文件父路径:"+file.getParent());
		System.out.println(file.canRead()?"文件可读":"文件不可读");
		System.out.println(file.canWrite()?"文件可写":"文件不可写");
		System.out.println(file.isFile()?"是一个文件":"不是一个文件");
		System.out.println(file.isDirectory()?"是一个目录":"不是一个目录");
		System.out.println(file.isAbsolute()?"是绝对路径":"不是绝对路径");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年mm月dd日 HH:MM:SS");
		System.out.println("最后修改时间为:"+sdf.format(new Date(file.lastModified())));
		System.out.println("文件大小为:"+file.length());
//		System.out.println("是否成功删除文件:"+file.delete());
		
		
	}

}
