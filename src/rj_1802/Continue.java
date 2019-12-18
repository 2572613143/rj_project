package rj_1802;

public class Continue {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=0;
		for (int i = 0; i < 100; i++) {
			if (i%2==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println("sum="+sum);
	}

}
