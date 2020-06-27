package com.datadriven.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData_Comparison {

	static Map<String, String> map = new LinkedHashMap<>();
	static Set<String> keyset = new LinkedHashSet<>();
	static List<String> valueList = new ArrayList<>();

	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\i2356\\eclipse-workspace\\Selenium_Concepts\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int rowsize = sheet.getPhysicalNumberOfRows();
		//To print first row
				int i = 0;
				if (i == 0) {

					Row row = sheet.getRow(i);
					int cellsize = row.getPhysicalNumberOfCells();

					for (int j = 0; j < cellsize; j++) {
						Cell cell = row.getCell(j);
						String stringCellValue = cell.getStringCellValue();
						keyset.add(stringCellValue);
					}
				}
				System.out.println("Column Names: " + keyset);
				
				i++;
				//To print second row
				if (i == 1)
				{
					Row row = sheet.getRow(1);
					int cellsize = row.getPhysicalNumberOfCells();

					for (int j = 0; j < cellsize; j++) {
						Cell cell = row.getCell(j);
						String stringCellValue = cell.getStringCellValue();
						valueList.add(stringCellValue);
					}
				}
				System.out.println("Value Name: " + valueList);

				//To print map
				int index = 0;
				for (String columnName : keyset) {
					map.put(columnName, valueList.get(index));
					index++;
				}
				System.out.println(map);
			}
}
