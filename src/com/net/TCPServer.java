package com.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.sound.sampled.Port;

import org.apache.commons.math3.random.ISAACRandom;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 创建服务器套接字
		ServerSocket fwqtjz=new ServerSocket(8899);
		
		while(true) {
			//获取客户端接口套接字
			Socket khdtjz=fwqtjz.accept();
			//通过客户端套接字获取ip地址
			String	ip=khdtjz.getInetAddress().getHostAddress();
			//通过客户端套接字获取端口号
			int	port=khdtjz.getPort();
			System.out.println("和客户端连接的ip地址是"+ip+",端口号是"+port+"的电脑连接上了");
			
			InputStream is=khdtjz.getInputStream();
			byte[]zjhc=new byte[1024];
			FileOutputStream fout=new FileOutputStream("d:\\upload\\"+ip+".jpg");
			int b=is.read(zjhc);
			
			while(b!=-1) {
				fout.write(zjhc,0,b);
				b=is.read(zjhc);
			}
			
			String xinxi="文件上传成功";
			zjhc=new byte[1024];
			OutputStream os=khdtjz.getOutputStream();
			os.write(xinxi.getBytes());
			os.close();
		}
	}

}
