package com.io;

import java.io.RandomAccessFile;

public class RandomAccessFile_ {

	public static void main(String[] args) throws Exception {
	
		RandomAccessFile  raf=new RandomAccessFile("time.txt", "rw");
		
		int time=Integer.parseInt(raf.readLine())-1;
		if (time>0) {
			System.out.println("您还可以尝试"+time+"次");
			raf.seek(0);
			raf.write((time+"").getBytes());
		} else {
			System.out.println("使用次数已用完");
		}
		raf.close();
	}

}
