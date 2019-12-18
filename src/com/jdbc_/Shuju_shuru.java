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

public class Shuju_shuru {
	static Connection lianjie=null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		 lianjie= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf8", "root", "123456");
		// TODO 自动生成的方法存根
	 File mulu=new File("E:\\Java\\录数据\\ticeTrue");
	 	File[] files=mulu.listFiles();
	 		
	 	System.out.println("一共有"+files.length+"个文件");
	 	for (File file : files) {
			System.out.println(file);
			if(file.getName().endsWith("xlsx")) {
				read_xlsx_and_write_db(file);
			}
			else if (file.getName().endsWith("xls")) {
				read_xls_and_write_db(file);
			}
			
		}
	}
	public static void read_xlsx_and_write_db(File file) throws Exception {
		FileInputStream	fin=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet	sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		for (int i = 1; i < rows; i++) {
			//读取每一行
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			//找到第四个单元格
			XSSFCell cell20=row.getCell(19);
			XSSFCell cell21=row.getCell(20);
			if (cell20!=null&&cell21!=null) {
				
			
			String zuo_shili=cell20.getStringCellValue();
			/*System.out.println(zuo_shili);*/
			
			
			//读取这个单元格的值
			String you_shili=cell21.getStringCellValue();
			/*System.out.println(you_shili);*/
			
			
			
			//通过连接对象获得语句
			/*Statement yuju= lianjie.createStatement();*/
			//定义更新sql语句
			if (zuo_shili!=null&&you_shili!=null) {
				 PreparedStatement ydy_yuju=(PreparedStatement) lianjie.prepareStatement(""
			 +"update sheet1 set `左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
			ydy_yuju.executeUpdate();
			}
			
			/*String sql="update 18rj2 set zuoyan = '"+zuo_shili+"' , youyan='"+you_shili+"' WHERE xuehao = '"+xuehao+"'";*/
			//通过语句对象执行sql
			}
		}
		}
	public static void read_xls_and_write_db(File file) throws Exception {
		FileInputStream	fin=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(fin);
		HSSFSheet	sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		for (int i = 1; i < rows; i++) {
			//读取每一行
			HSSFRow row=sheet.getRow(i);
			HSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			//找到第四个单元格
			HSSFCell cell20=row.getCell(19);
			HSSFCell cell21=row.getCell(20);
			if (cell20!=null&&cell21!=null) {
				
			
			String zuo_shili=cell20.getStringCellValue();
			/*System.out.println(zuo_shili);*/
			
			
			//读取这个单元格的值
			String you_shili=cell21.getStringCellValue();
			/*System.out.println(you_shili);*/
			
			
			//通过连接对象获得语句
			/*Statement yuju= lianjie.createStatement();*/
			//定义更新sql语句
			if (zuo_shili!=null&&you_shili!=null) {
				 PreparedStatement ydy_yuju=(PreparedStatement) lianjie.prepareStatement(""
			 +"update sheet1 set `左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
			ydy_yuju.executeUpdate();
			}
			
			/*String sql="update 18rj2 set zuoyan = '"+zuo_shili+"' , youyan='"+you_shili+"' WHERE xuehao = '"+xuehao+"'";*/
			//通过语句对象执行sql
			}
		}
		}
}
