package com.jihe;

import java.util.Comparator;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class CustomComparator implements Comparator<Object>{

	public int compare(Object o1,Object o2) {
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
	}

	
}
public class Bct_ {

	public Bct_() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		Map<String, String> hmap=new TreeMap<String, String>(new CustomComparator());
//		Map hmap=new HashMap();
		hmap.put("3","贾宇超");
		hmap.put("1","张宝英");
		hmap.put("2","王大中");
		hmap.put("5","董凯凯");
		hmap.put("4","王泽松");
		System.out.println(hmap);
		
		Set<String> jianji=hmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key=(Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
			
		}
		
		

	}

}
