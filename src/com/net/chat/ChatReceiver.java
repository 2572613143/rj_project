package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable {
	private DatagramSocket ds;
	public ChatReceiver(DatagramSocket ds) {
		this.ds=ds;
	}

	@Override
	public void run() {
		while (true) {
		try {
			byte[]	buf=new byte[1024];
			DatagramPacket	dp=new DatagramPacket(buf,buf.length);
				ds.receive(dp);
				//构造获得的二进制数据，转化为string
				String	xinxi=new String(dp.getData(),0,dp.getLength());
				//将获得的信息展现在控制台上
				System.out.println(xinxi);
				
			}
		 catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		}
		
	}

}
