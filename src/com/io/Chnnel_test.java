package com.io;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Chnnel_test {

	public static void main(String[] args) throws Exception {
	//源文件
		RandomAccessFile ywj	=new RandomAccessFile("ewm.jpg", "rw");
	//获取通道
		FileChannel yfc=ywj.getChannel();
	//目标文件
		RandomAccessFile mbwj=new RandomAccessFile("ewm2.jpg", "rw");
	//获取目标通道
	 FileChannel mbfc=mbwj.getChannel();
	 //执行复制
	 long cg=yfc.transferTo(0, yfc.size(), mbfc);
	 if (cg>0) {
		System.out.println("复制成功");
	}
	 ywj.close();
	 yfc.close();
	 mbwj.close();
	 mbfc.close();
	}

}
