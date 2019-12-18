package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		list.forEach(obj->System.out.println("迭代集合元素："+obj));
		
		/*System.out.println("利用列表集合对象使用jdk的foreach的循环输出每个元素");
		ArrayList.forEach("");*/
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("data_1");
		list1.add("data_2");
		list1.add("data_3");
		System.out.println(list1);
		Iterator<String> it=list1.iterator();
		it.forEachRemaining(obj->System.out.println("迭代集合元素:"+obj));
		
	}
	
}
