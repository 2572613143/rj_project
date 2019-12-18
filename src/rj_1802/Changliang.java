package rj_1802;

public class Changliang {

	public static void main(String[] args) {
		System.out.println("二进制以0b开头" + 0b11000110);
		System.out.println("八进制以0开头" + 0306);
		System.out.println("十六进制以0x开头" + 0xc6);

		System.out.println("单精度以f结尾" + 5.022e+6f);
		System.out.println("双精度以d结尾" + 5.022e+6d);
		System.out.println("双精度 结尾可以省略" + 5.022e+6);
		System.out.println("我的名字是" + '\u8d3e' + '\u5b87' + '\u8d85');
		// Java中的字符串常量使用双引号括起来
		System.out.println("hello,\nSeptember!");
		// 布尔型常量只有两个，true，flase、
		System.out.println("布尔型常量" + true + "或者" + false);
		// Java中的null常量，只能是引用数据类型

		System.out.println("null常量只有一个" + null + ",表示空的对象");
		
		Changliang changliang = null;
		//同变量类似的常量要使用final关键字，常量被赋值之后不能再次修改，常量一般用大写
		final int A = 5, b;//定义一个整形变量A，如果前面加上一个final修饰他就变成了一个常量
		b = 1;
		System.out.println(A);
		
	}

}
