package rj_1802;

public class JisShu {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <100; i+=2) {
			sum+=i;
			
	}
		System.out.println("100以内奇数sum="+sum);
		
		int sum1=0;
		for (int j = 0; j <= 100; j++) {
			if (j%2==0) {
				sum1+=j;
			}
			
		}
		System.out.println("100以内偶数sum="+sum1);
		
		int sum2=0;
		int a=1;
		while (a<100) {
			
			sum2+=a;
			a+=2;
		}
		System.out.println("100以内奇数sum="+sum2);
}
}