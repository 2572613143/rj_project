package com.api;

import java.util.Random;

public class Random_ {

	public static void main(String[] args) {
		Random r=new Random();
		System.out.println("随即生成一个[0-1)之间的一个浮点数"+Math.random());
		System.out.println("随即生成一个[0-1)之间的浮点数"+r.nextDouble());
		System.out.println("随即生成一个21亿到-21亿之间的整数"+r.nextInt());
		System.out.println("随即生成一个十以内不包含十的整数"+r.nextInt(10));
	
	}

}
