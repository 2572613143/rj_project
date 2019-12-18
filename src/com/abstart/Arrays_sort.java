package com.abstart;

import java.sql.Array;
import java.util.Arrays;

public class Arrays_sort {

	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2};
		System.out.println("排序前:");
		printArray(arr);
		System.out.println();
		Arrays.sort(arr);
		System.out.println("排序后:");
		printArray(arr);
		System.out.println();
		int index=Arrays.binarySearch(arr, 3);
		System.out.println("元素3的索引是:"+index);
		
		//拷贝
		int[] copied=Arrays.copyOfRange(arr, 1,7);
		for (int i = 0; i < copied.length; i++) {
			System.out.print(copied[i]+" ");
			
		}
		
		//替换
		Arrays.fill(arr, 8);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+":"+arr[i]+" ");
			
		}
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x!=arr.length-1) {
				System.out.print(arr[x]+",");
			} else {
				System.out.print(arr[x]+"]");
			}
			
		}
		
	}

}
