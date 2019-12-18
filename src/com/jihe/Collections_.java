package com.jihe;

import java.util.ArrayList;

import java.util.Collections;

public class Collections_ {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list, "赵","钱","孙","李","周");
		System.out.println("排序前:"+list);
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("自然排序之后:"+list);
		Collections.shuffle(list);
		System.out.println("随机排序之后:"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("集合首尾元素交换之后:"+list);
		
		ArrayList<Integer> list2=new ArrayList<>();
		Collections.addAll(list2, -3,9,2,8,5);
		System.out.println("集合中的元素:"+list2);
		System.out.println("集合中最大元素是:"+Collections.max(list));
		System.out.println("集合中最小元素是:"+Collections.min(list));
		Collections.replaceAll(list2, 8, 0);
		System.out.println("集合中0替换掉8是:"+list2);
		Collections.sort(list2);		//二分查找前，必须保证元素有序
		System.out.println("集合有序排列:"+list2);
		int index=Collections.binarySearch(list2, 9);
		System.out.println("集合用过二分查找方法查找元素9所在的脚标为:"+index);
		
		
		
	}

}
