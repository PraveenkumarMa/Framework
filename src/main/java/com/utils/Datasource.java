package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datasource {
	
	public static String[][] Customerdata(String sheetname) throws Throwable{
		
		File file =new File("./src/main/java/com/testdata/testdata crm.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook =new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		int rows = sheet.getPhysicalNumberOfRows();
		int cells =sheet.getRow(1).getLastCellNum();
		String[][] data = new String[rows-1][cells];
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<cells;j++) {
				
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		return data;
		
	}

}
