package com.dairyproduct.valueadded;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\karth\\eclipse-workspace\\Com.Selenium\\valueadded\\Excel\\Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		

	}

}
 