package com.changyonglei;

import java.util.function.IntConsumer;

import org.omg.CORBA.SystemException;

public class E58 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long kssj=System.currentTimeMillis();
		int sum=0;
		for (long i = 0; i < 100000000L; i++) {
			sum +=i;
			
		}
		long jssj=System.currentTimeMillis();
		System.out.println("从0到1亿需要耗时"+(jssj-kssj)+"毫秒");
	}

}
