package rj_1802;

public class E07 {

		//静态方法只能调用本类的静态方法，不能调用非本类的静态方法
		//1.实现两个整数相加
		public static int add(int x,int y) {
		return x+y;
		}
		//2.实现三个整数相加
		public static int add(int x,int y,int z) {
			return x+y+z;
		}
		//3.实现两个浮点数相加
		public static double add(double x,double y) {
			return x+y;
		}
	public static void main(String[] args) {
		int sum1=add(2, 3);
		int sum2=add(2, 3,4);
		double sum3=add(8.2,4.1);
		
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}
	}


