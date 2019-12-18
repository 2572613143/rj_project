package com.jingTai;
@FunctionalInterface
interface Calcable{
	int calc(int sum);
}

class Math{
	public static int abs(int sum) {
		if (sum<0) {
			return -sum;
		}
		else {
			return sum;
		}
	}
}
public class E24 {
	private static void printAbs(int num,Calcable calcable) {
		System.out.println(calcable.calc(num));
	}
	public static void main(String[] args) {
		printAbs(-10,n->Math.abs(n));
		

	}

}
