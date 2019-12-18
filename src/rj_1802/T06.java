package rj_1802;

public class T06 {
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
		// TODO 自动生成的方法存根
		int sum1=add(3,2);
		int sum2=add(3, 2,1);
		double sum3=add(0.5,0.4);
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}

}
