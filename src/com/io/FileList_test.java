package com.io;

import java.io.File;

public class FileList_test {

	public static void main(String[] args) {
		File file=new File("E:\\Java\rj_project\\rj_1802\\src\\com");
		FileDir(file);
	}

	public static void FileDir(File file) {
		// TODO 自动生成的方法存根
		File[] listfiles=file.listFiles();
		for(File files:listfiles) {
			if (files.isDirectory()) {
				FileDir(files);
				
			}
			System.out.println(files);
		}
		
	}

}
