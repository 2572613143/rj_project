package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjbh2 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Path wj=Paths.get("E:\\Java\\班级信息.txt");
		Path bjbh=Paths.get("E:\\Java\\求班级编号.txt");
		Path bjbh2=Paths.get("E:\\Java\\班级编号.txt");
		
		Files.createFile(bjbh2);
		List<String> neirong=new ArrayList<>();
		List<String> names=Files.readAllLines(bjbh);
		
		List<String> list=Files.readAllLines(wj);
		
		Map<String, String>map=new HashMap<>();
		for (String line:list) {
			String[] zfcsz=line.split("\t");
		}
		Files.write(bjbh2, neirong, StandardOpenOption.APPEND);
	}

}
