package com.jihe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Bct_2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties sxj=new Properties();
		sxj.load(new FileInputStream("d:\\text.properties"));
		sxj.forEach((k,v)->System.out.println(k+":"+v));
		
		Properties pps=new Properties();
		pps.load(new FileInputStream("text.properties"));
		pps.forEach((k,v)->System.out.println(k+"="+v));
		FileOutputStream out=new FileOutputStream("text.properties");
		pps.setProperty("charset","UTF-8");
		pps.store(out,"新增 charset编码");
	}

}
