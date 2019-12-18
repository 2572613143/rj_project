package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_ {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("poem.txt");
		FileWriter fw=new FileWriter("poem_1.txt");
		
		/*char []buff=new char[2048];*/
		int b=fr.read();
		for (int i = 0; i <100; i++) {
			
			fw.write(b);
		}
		
		fr.close();
		fw.close();
	}
	
}
