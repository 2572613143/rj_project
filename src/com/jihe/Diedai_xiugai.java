package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai_xiugai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
			list.add("Jack");
			list.add("Annie");
			list.add("Rose");
			list.add("Tom");
			Iterator<String> it=list.iterator();
			while (it.hasNext()) {
				Object obj=it.next();
				if ("Annie".equals(obj)) {
					list.remove(obj);
					break;
				}
			}
			System.out.println(list);

	}

}
