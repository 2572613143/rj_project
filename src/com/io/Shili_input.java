package com.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shili_input {

	public static void main(String[] args) throws Exception {
		FileInputStream shilishuju=new FileInputStream("shili.xlsx");
		XSSFWorkbook wb_source=new XSSFWorkbook(shilishuju);
		XSSFSheet sheet_sourse=wb_source.getSheet("sheet1");
		int rows_source=sheet_sourse.getLastRowNum();
		Map map=new HashMap<>();
		for (int i = 1; i <=rows_source; i++) {
			XSSFRow rowi_source=sheet_sourse.getRow(i);
			Iterator<Cell> celljihe_source=rowi_source.cellIterator();
			List list=new ArrayList<>();
			while (celljihe_source.hasNext()) {
				Cell cell_source=(Cell) celljihe_source.next();
				if (cell_source.getCellType()==CellType.STRING) {
					list.add(cell_source.getStringCellValue());
				} else {
					list.add(cell_source.getNumericCellValue());
				}
				
			}
			map.put(list.get(3), list);
		}
		System.out.println(map);
		FileInputStream shilishuju_dest=new FileInputStream("18rj2.xlsx");
		XSSFWorkbook wb_dest=new XSSFWorkbook(shilishuju_dest);
		XSSFSheet sheet_dest=wb_dest.getSheet("sheet1");
		int row_dest=sheet_dest.getLastRowNum();
		for (int i = 1; i < row_dest; i++) {
			XSSFRow rowi_dest=sheet_dest.getRow(i);
			String xuehao=rowi_dest.getCell(3).getStringCellValue();
			List list_dest=(ArrayList)map.get(xuehao);
			System.out.println(list_dest);
			if (list_dest!=null) {
				rowi_dest.createCell(15, CellType.STRING).setCellValue(list_dest.get(15).toString());
				rowi_dest.createCell(16, CellType.STRING).setCellValue(list_dest.get(16).toString());
			}
			
		}
		FileOutputStream shilishujushuchu_dest=new FileOutputStream("18rj2.xlsx");
		 wb_dest.write(shilishujushuchu_dest);
		 shilishujushuchu_dest.close();
	}

}
