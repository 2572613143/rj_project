package com.changyonglei;

public class E56 {

	public static void main(String[] args) {
		String s="我爱你中国";
		StringBuffer zfchc=new StringBuffer(s);
		System.out.println(zfchc);
		//添加
		zfchc.append("!");
		System.out.println(zfchc);
		zfchc.insert(3,',');
		System.out.println(zfchc);
		//删除
		zfchc.delete(2, 4);
		System.out.println(zfchc);
		//修改
		zfchc.replace(2, 4, "香港");
		System.out.println(zfchc);
		//反转
		zfchc.reverse();
		System.out.println(zfchc);

	}

}
