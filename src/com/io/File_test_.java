package com.io;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class File_test_ {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
				Path lujing=Paths.get("D:\\360Downloads\\Software\\444");
				Files.createDirectories(lujing);
				Path wj=Paths.get("D:\\360Downloads\\Software\\444\\test.txt");
				//Files.createFile(wj);
				List<String> neirong=new ArrayList<>();
				neirong.add("这是一个测试文件");
				/*Files.write(wj, neirong, StandardOpenOption.APPEND);*/
				List<String> list=Files.readAllLines(wj);
				System.out.println("文件的内容是"+list);
				System.out.println("文件的大小是"+Files.size(wj)+"个字节");
	
	}

}
