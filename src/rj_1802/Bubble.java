/**
 * 
 */
package rj_1802;

import java.lang.reflect.Array;

public class Bubble {

	
	public static void main(String[] args) {
		int[]array= {9,8,3,5,2};
		System.out.println("这个数组的长度是"+array.length);
		for (int says:array) {
			System.out.print(says+" ");
		}
		int temp=0;
		for (int m = 1; m < array.length; m++) {
			for (int j = 0; j < array.length-m; j++) {
				if (array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println();
		for (int szys:array) {
			System.out.print(szys+" ");
		}
	}

}
