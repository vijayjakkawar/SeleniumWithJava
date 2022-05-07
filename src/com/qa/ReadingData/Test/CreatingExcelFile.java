package com.qa.ReadingData.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelFile {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\Desktop\\testing study doc\\automation\\newFile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Demo1");
	//	XSSFSheet sheet2 = workbook.createSheet("Demo2");
		
		for(int row=0; row<10; row++)
		{
		XSSFRow	rows1 = sheet1.createRow(row);
	//	XSSFRow	rows2 = sheet1.createRow(row);
		
		for(int cell=0; cell<5; cell++)
		{
			rows1.createCell(cell).setCellValue("xyz");
	//		rows2.createCell(cell).setCellValue("abc");
		}
			
		}
		
		workbook.write(fos);
		fos.close();
		System.out.println("File is created");

	}

}
