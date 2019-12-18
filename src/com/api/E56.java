package com.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.*;

public class E56 {

	public static void main(String[] args) throws ParseException {
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis()+1000);
		Date date3=new Date(System.currentTimeMillis());
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		SimpleDateFormat s=new SimpleDateFormat("Gyyyy年MM月dd日 HH:mm:ss E");
		//自定义格式化 年月日小时分钟秒 星期
		System.out.println(s.format(date1));
		
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(calendar.YEAR);
		int month=calendar.get(calendar.MONTH)+1;
		int date=calendar.get(calendar.DATE);
		
		System.out.println("当前时间为"+year+"年"+month+"月"+date+"日");
		
		calendar.add(Calendar.DATE,1540);
		year=calendar.get(calendar.YEAR);
		month=calendar.get(calendar.MONTH)+1;
		date=calendar.get(calendar.DATE);
		System.out.println("1540天以后是"+year+"年"+month+"月"+date+"日");
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
	 	LocalDate lat=LocalDate.now();
	 	//用sdf1对象来解析当前日期加100天
	 	//simpleDateFormat:parse方法将字符串解析为date的对象
	 	//simpleDateFormat:format方法将date类的对象格式为字符串
	 	Date date4=sdf1.parse(""+lat.plusDays(100));
	 	SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年M月dd日");
	 	System.out.println("100天以后是"+sdf2.format(date4));
		
	 	System.out.println("今年是"+Year.now()+"年");
	 	SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM");
	 	Date date5=sdf3.parse(""+YearMonth.now());
	 	SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年M月");
	 	System.out.println("当前年月是"+sdf4.format(date4));
	 	
	 	//输出系统时区
	 	ZoneId zoneId=ZoneId.systemDefault();
	 	System.out.println("当前系统时区是"+zoneId);
	 	
	 	//Instant:此刻以UTC为基准
	 	Instant instant=Instant.now();
	 	System.out.println("当前时间是"+instant);
	 	
	}

}
