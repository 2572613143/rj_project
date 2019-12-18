package com.api;

public class baozhuang_class {

	public static void main(String[] args) {
		int a=20;
		//自动装箱：将int这个基本数据变量装到integer这个引用数据类型的对象中
		Integer b=a;
		//自动拆箱：将integer这个数据类型的对象拆开变成int这个基本数据类型的变量
		int c=b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//将字符串换成整数的三种办法
		String chengji="88";
		String chengji1=chengji+10;
		System.out.println(chengji1);
		System.out.println("NO.1包装类的valueof方法--->"+(Integer.valueOf(chengji)+10));
		System.out.println("NO.2包装类的parseXXX方法--->"+(Integer.parseInt(chengji)+10));
		System.out.println("NO.3包装类的构造方法--->"+(new Integer(chengji)+10));
		
		Integer zs=88;
		System.out.println(zs);
		System.out.println("NO.1包装类的valueof方法--->"+String.valueOf(zs));
		System.out.println("NO.2string类的toString方法--->"+zs.toString());
		System.out.println("NO.3空串连接字符串--->"+zs+"");
		
		

	}

}
