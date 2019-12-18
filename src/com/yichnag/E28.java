package com.yichnag;
public class E28 {

public static int divide(int x,int y) {
	try {
		int result =x/y;
		return result; 
	} catch (Exception e) {
		System.out.println("捕获到错误的信息"+e.getMessage());
	}finally {
		System.out.println("无论如何都要执行finally模块");
	}
	return -1;
}

	public static void main(String[] args) {
		int result=divide(4,2);
		if (result==-1) {
			System.out.println("程序发生异常!");
		}
		else {
			System.out.println(result);
		}
		

	}

}
