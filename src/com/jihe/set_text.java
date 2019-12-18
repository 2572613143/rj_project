package com.jihe;

import java.util.HashSet;

public class set_text {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		
		set.forEach(o->System.out.println(o));
		
	}

}
