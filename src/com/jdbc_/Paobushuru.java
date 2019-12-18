package com.jdbc_;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.PreparedStatement;

public class Paobushuru {
	static Connection lianjie=null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		 lianjie= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf8", "root", "123456");
		// TODO 自动生成的方法存根
	 File mulu=new File("C:\\Users\\Administrator\\Desktop\\新建文件夹");
	 	File[] files=mulu.listFiles();
	 		
	 	System.out.println("一共有"+files.length+"个文件");
	 	for (File file : files) {
			System.out.println(file);
			if(file.getName().endsWith("xlsx")) {
				read_xlsx_and_write_paobu(file);
			}
			else if (file.getName().endsWith("xls")) {
				read_xls_and_write_paobu(file);
			}
			
		}
	}
	public static void read_xlsx_and_write_paobu(File file) throws Exception {
		FileInputStream	fin=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet	sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		/*System.out.println(rows);*/
		for (int i = 1; i < rows; i++) {
			//读取每一行
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			
			//找到第四个单元格
			XSSFCell cell13=row.getCell(12);
			
			if (cell13!=null) {
				
			
			String wushipaobu=cell13.getStringCellValue();
			
			if (wushipaobu!=null) {
				 PreparedStatement ydy_yuju=(PreparedStatement) lianjie.prepareStatement(""
			 +"update sheet1 set `50米跑`=? where `学号`=?");
			ydy_yuju.setString(1, wushipaobu);
			
			ydy_yuju.setString(2, xuehao);
			ydy_yuju.executeUpdate();
			}
			
			}
		}
		}
	public static void read_xls_and_write_paobu(File file) throws Exception {
		FileInputStream	fin=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(fin);
		HSSFSheet	sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		/*System.out.println(rows);*/
		for (int i = 1; i < rows; i++) {
			
			HSSFRow row=sheet.getRow(i);
			HSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			
			HSSFCell cell13=row.getCell(12);
			if (cell13!=null) {
				
			String wushipaobu=cell13.getStringCellValue();
			
			if (wushipaobu!=null) {
				 PreparedStatement ydy_yuju=(PreparedStatement) lianjie.prepareStatement(""
			 +"update sheet1 set `50米跑`=? where `学号`=?");
			ydy_yuju.setString(1, wushipaobu);
			ydy_yuju.setString(2, xuehao);
			ydy_yuju.executeUpdate();
			}
			
			}
		}
		}
}
