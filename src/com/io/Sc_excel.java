package com.io;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Sc_excel {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("测试环境");

		HSSFRow row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("年级");
		row0.createCell(1).setCellValue("班级班号");
		row0.createCell(2).setCellValue("班级名称");
		row0.createCell(3).setCellValue("项目名称");
		row0.createCell(4).setCellValue("测试老师");
		row0.createCell(5).setCellValue("测试时间");
		row0.createCell(6).setCellValue("测试器材");
		row0.createCell(7).setCellValue("测试方式(手工/仪器)");
		Path bjxx = Paths.get("E:\\Java\\班级信息.txt");
		List<String> lines = Files.readAllLines(bjxx);
		int j=0;
		for (String line : lines) {
			String[] zfcsz = line.split("\t");

			for (int i = j*10+1; i < j*10+11; i++) {
				HSSFRow rowi = sheet.createRow(i);
				rowi.createCell(0).setCellValue("42");
				rowi.createCell(1).setCellValue(zfcsz[0]);
				rowi.createCell(2).setCellValue(zfcsz[1]);
				if (i%10==1) {
					rowi.createCell(3).setCellValue("身高");
					rowi.createCell(4).setCellValue("高佳明");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("学院体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}
				
				if (i%10==2) {
					rowi.createCell(3).setCellValue("体重");
					rowi.createCell(4).setCellValue("李国珍");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("学院体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
					}	
				if (i%10==3) {
					rowi.createCell(3).setCellValue("肺活量");
					rowi.createCell(4).setCellValue("李雪纯/刘念念");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("学院体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}		
				if (i%10==4) {
					rowi.createCell(3).setCellValue("50米跑");
					rowi.createCell(4).setCellValue("赵玉巧/李红梅");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("学院田径场");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("1");
				}	
				if (i%10==5) {
					rowi.createCell(3).setCellValue("立定跳远");
					rowi.createCell(4).setCellValue("赵武科/青越");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("学院体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}	
				if (i%10==6) {
					rowi.createCell(3).setCellValue("坐位体前屈");
					rowi.createCell(4).setCellValue("卢渊博/周娟");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("学院体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("1");
				}		
				if (i%10==7) {
					rowi.createCell(3).setCellValue("1000米跑");
					rowi.createCell(4).setCellValue("汪先森/周天翔");
					rowi.createCell(5).setCellValue("2019/11/9");
					rowi.createCell(6).setCellValue("学院田径场");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}		
				if (i%10==8) {
					rowi.createCell(3).setCellValue("引体向上");
					rowi.createCell(4).setCellValue("陈勇军/梅勇洁");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("学院体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}		
				if (i%10==9) {
					rowi.createCell(3).setCellValue("800米跑");
					rowi.createCell(4).setCellValue("慕斯/郑新");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("学院田径场");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("1");
				}	
				if (i%10==0) {rowi.createCell(3).setCellValue("一分钟仰卧起坐");
					rowi.createCell(4).setCellValue("毛声宇/杨钰莹");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("学院体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}
					
			}
			j++;
		}
		FileOutputStream fOut = new FileOutputStream("d:\\测试模板.xls");
		wb.write(fOut);
		fOut.close();
	}

}
