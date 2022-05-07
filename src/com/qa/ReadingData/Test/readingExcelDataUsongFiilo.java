package com.qa.ReadingData.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class readingExcelDataUsongFiilo {

	public static void main(String[] args) throws FilloException {
		
		
		Fillo fi = new Fillo();
		
		Connection conn = fi.getConnection("C://ExcelData/ReadingData.xlsx");
		
		String query = "Select * from UserData";
		
		Recordset rs = conn.executeQuery(query);
		
		while(rs.next())
		{
		System.out.println(rs.getField("FirstName"));
		
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
