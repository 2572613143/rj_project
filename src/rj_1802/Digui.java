package rj_1802;

public class Digui {

	public static int getSum(int n) {
		if (n==1) {
			return 1;
		}
		int temp=getSum(n-1);
		return temp+n;//4+3 
	}
	public static void main(String[] args) {
		System.out.println("1到4的和是"+getSum(4));
	}
}
