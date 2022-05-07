package com.qa.ReadingData.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	// excel-->workbook-->sheets-->rows-->cells
	// FileInputStream-->XSSFWorkbook-->XSSFSheet-->XSSFRow-->XSSFCells

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\hp\\Desktop\\testing study doc\\Apache POI\\books.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// getting sheet by giving the name of the sheet
		 XSSFSheet sheet = workbook.getSheet("Sheet1");

		// getting sheet by giving the index of the sheet (sheet index stars from 0)
		//XSSFSheet sheet = workbook.getSheetAt(0);

		 int rowcount = sheet.getLastRowNum();
		 int cellcount = sheet.getRow(0).getLastCellNum();
		 
		 for(int i=0; i<rowcount; i++)
		 {
			XSSFRow currenRow = sheet.getRow(i);   // focussedm on current row
			
			for(int j=0; j<cellcount; j++)
			{
				String value = currenRow.getCell(j).toString();
				System.out.print("  " +value);
			}
			System.out.println();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
