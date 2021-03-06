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

public class Input_shili {
	static Connection lianjie=null;
	public static void main(String[] args) throws Exception {
	File file=new File("d:\\tice");
    File[] 	wenjian_jihe=file.listFiles();
    System.out.println(wenjian_jihe.length);
    for (File file2 : wenjian_jihe) {
		System.out.println(file2);
		if (file2.getName().endsWith("xlsx")) {
			dwj(file2);
		} else if (file2.getName().endsWith("xls")) {
			dwj_xls(file2);
		}
		
	}
	}
	public static void dwj(File wjm) throws Exception {
	FileInputStream	fin=new FileInputStream("shili.xlsx");
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
		XSSFCell cell16=row.getCell(15);
		String zuo_shili=cell16.getStringCellValue();
		System.out.println(zuo_shili);
		
		XSSFCell cell17=row.getCell(16);
		//读取这个单元格的值
		String you_shili=cell17.getStringCellValue();
		System.out.println(you_shili);
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection lianjie= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf8", "root", "123456");
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
	public static void dwj_xls(File wjm) throws Exception {
		FileInputStream	fin=new FileInputStream("shili.xlsx");
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
			HSSFCell cell16=row.getCell(15);
			String zuo_shili=cell16.getStringCellValue();
			System.out.println(zuo_shili);
			
			HSSFCell cell17=row.getCell(16);
			//读取这个单元格的值
			String you_shili=cell17.getStringCellValue();
			System.out.println(you_shili);
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection lianjie= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf8", "root", "123456");
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
	

