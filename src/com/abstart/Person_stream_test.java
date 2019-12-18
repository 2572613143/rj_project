package com.abstart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.jh182.Person;

public class Person_stream_test {
	
	public static void main(String[] args) {
		List<PersonModel> list=new ArrayList<>();
		PersonModel p1=new PersonModel("Wang Yu","男",18);
		PersonModel p2=new PersonModel("Jia Yu","女",18);
		PersonModel p3=new PersonModel("Zhang Yu","男",18);
		PersonModel p4=new PersonModel("Liu Yu","女",16);
		list=Arrays.asList(p1,p2,p3,p4);
		System.out.println(list);
		//old
		for (PersonModel pm : list) {
			System.out.println(pm.getName());
		}
		//new 1
		List<String> list2=list.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		//new2
		List<String> list3=list.stream().map(PersonModel::getName).collect(Collectors.toList());
		System.out.println(list3);
		
		//new3
		List<String> list4=list.stream().map(a->{return a.getName();}).collect(Collectors.toList());
		System.out.println(list4);
	}
}
