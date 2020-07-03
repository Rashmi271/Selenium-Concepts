package com.datadriven.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\i2356\\eclipse-workspace\\Selenium_Concepts\\Credentials.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheetAt(0);
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		for (int i = 0; i < physicalNumberOfRows; i++) {
			
			Row row = sheet.getRow(i);
			
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
				} 
				
				else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					System.out.println(numericCellValue);
				}
					}
				
			}
		
		
		Cell createCell = wb.createSheet("New_Sheet1").createRow(4).createCell(4);
		createCell.setCellValue("Done");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Data Written Successfully");
		
		}
	
}


