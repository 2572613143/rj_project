package com.api;

import java.io.IOException;


public class Runtime_ {

	public static void main(String[] args) throws InterruptedException, IOException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器的个数是:"+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小"+rt.freeMemory()/1024+"kB");
		System.out.println("最大可用内存大小:"+rt.maxMemory()/1024/1024+"MB");

		//得到表示进程的process;
		Process jincheng=rt.exec("mspaint");//mspaint画图 notepad记事本
		//程序休眠三秒
		Thread.sleep(3000);
		jincheng.destroy();
		
	}

}
