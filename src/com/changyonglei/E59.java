package com.changyonglei;

import java.util.Properties;
import java.util.Set;

public class E59 {

	public static void main(String[] args) {
		//获取当前系统属性
		Properties properties=System.getProperties();
		System.out.println(properties);
		//获取所有的系统属性的key(属性名)所对应的值(属性值),返回set值
		Set<String>propertyNames=properties.stringPropertyNames();
		for (String key : propertyNames) {
			String value =System.getProperty(key);
			System.out.println(key+"--->"+value);
		}
		
	}

}
