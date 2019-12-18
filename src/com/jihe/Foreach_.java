package com.jihe;

import java.util.HashSet;

public class Foreach_ {
	static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		//foreach循环遍历数组
		for(String str:strs){
			str="ddd";
		}
		System.out.println("foreach循环修改后的数组:"+strs[0]+","+strs[1]+","+strs[2]);
		//for循环遍历数组
		for (int i = 0; i < strs.length; i++) {
			strs[i]="ddd";
		}
		System.out.println("普通for循环修改后的数组:"+strs[0]+","+strs[1]+","+strs[2]);
			
		//HashSet能够去掉重复元素，是因为HashSet里的String类已经 重写了object类
		HashSet<Comparable> hset=new HashSet<Comparable>();
		hset.add(new String("Jack"));
		hset.add(new String("Eva"));
		hset.add(new String("Rose"));
		hset.add(new String("Rose"));
		hset.add(new String("Pete"));
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
		
		
		hset.removeAll(hset);
		hset.add(1);
		hset.add(2);
		hset.add(3);
		hset.add(4);
		hset.add(5);
		hset.add(5);
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
		
	}

}
