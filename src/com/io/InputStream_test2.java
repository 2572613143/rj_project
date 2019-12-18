package com.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class InputStream_test2 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		FileInputStream in=new FileInputStream("d:\\pic15_06.jpg");
		FileOutputStream out=new FileOutputStream("pic15_06.jpg");
		long kssj=System.currentTimeMillis();
		byte[] zjhc=new byte[1024];
		int b=0;
		while ((b=in.read(zjhc))!=-1) {
			out.write(zjhc,0,b);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝图片文件耗时"+(jssj-kssj)+"毫秒");
		out.close();
		in.close();
		
	}
}	


