package rj_1802;
/*紫色的代码是关键字
 * 褐色的代码是参数或者局部变量
 * 蓝色的代码是成员变量，他的地位比局部变量高
 * 黑色的代码是标示符:包名，（所有字母一类小写）类名，（每个单词首字母大写）方法名（第一个单词首字母大写，后面小写）
 * 
 * 
 * 
 * */
public class Zengxingshuju {

	public static void main(String[] args) {
		byte a=1; //00000001
		short b=1;//00000000 00000001
		int c=1;//00000000 00000000 00000000 00000001
		long d=1;//00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
		
		char ci='a';
		char r1=97;
		int ac=97;
		boolean bc=true;
		boolean bg=false;
		
		System.out.println(bc);
		System.out.println(bg);
		System.out.println(ci);
		System.out.println(r1);
		System.out.println((char)ac);
		System.out.println("布尔型数据的取值范围是"+Boolean.TRUE+"-"+Boolean.FALSE);
		System.out.println("字符型数据的长度是"+Character.SIZE);
		System.out.println("字符型数据的取值范围是"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
		System.out.println("字节型整数数据的长度是"+Byte.SIZE);
		System.out.println("短整型整数数据的长度是"+Short.SIZE);
		System.out.println("型整数数据的长度是"+Integer.SIZE);
		System.out.println("长整型整数数据的长度是"+Long.SIZE);
		System.out.println("单精度型数据的长度是"+Float.SIZE);
		System.out.println("双精度型数据的长度是"+Double.SIZE);
		System.out.println("单精度型数数据的取值范围是"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.out.println("双精度型数据的取值范围是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		System.out.println("字节型整数数据的取值范围是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整型整数数据的取值范围是"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("型整数数据的取值范围是"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整型整数数据的取值范围是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
	}

}
