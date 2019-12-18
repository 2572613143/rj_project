package rj_1802;

public class ConDition {

	public static void main(String[] args) {
		int age=20;
		if (age<=12){
			System.out.println("此人是儿童");
		}
		else if (age<18) {
			System.out.println("此人是未成年");
		}
		else {
			System.out.println("此人是 成年人");
		}
		
	    int month=5;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("这个季节是冬季 ");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("这个季节是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("这个季节是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("这个季节是秋季");
			break;

		default:
			break;
		}
	}

}
