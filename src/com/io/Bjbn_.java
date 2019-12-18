package com.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Bjbn_ {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Path wj=Paths.get("E:\\Java\\班级信息.txt");
		Path bjbh=Paths.get("E:\\Java\\求班级编号.txt");
		Path bjbh2=Paths.get("E:\\Java\\班级编号.txt");
		
		Files.createFile(bjbh2);
		List<String> neirong=new ArrayList<>();
		List<String> names=Files.readAllLines(bjbh);
		
		List<String> list=Files.readAllLines(wj);
		System.out.println("文件的内容是"+list);
		System.out.println("文件的大小是"+Files.size(wj)+"个字节");
		for (String name : names) {
		for (String line : list) {
			String[] zfcsz=line.split("	");
			if (name.equals(zfcsz[1])) {
			System.out.println(zfcsz[0]);
			neirong.add(zfcsz[0]);
			}
		
			
		}
		}
		Files.write(bjbh2, neirong, StandardOpenOption.APPEND);
	}

}
