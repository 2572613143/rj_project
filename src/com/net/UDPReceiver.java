package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
	//创建套接字
	DatagramSocket	ds=new DatagramSocket(8900);
	//定义一个缓冲数组用来接受对象
	byte[]	buf=new byte[1024];
	//定义一个数组报对象，用来封装接受数据
	DatagramPacket	dp=new DatagramPacket(buf,buf.length);
	System.out.println("等待接受数据");
	//在死循环里接收数据
	while (true) {
		ds.receive(dp);
		//构造获得的二进制数据，转化为string
		String	xinxi=new String(dp.getData(),0,dp.getLength());
		//将获得的信息展现在控制台上
		System.out.println(xinxi);
		
	}
	}

}
