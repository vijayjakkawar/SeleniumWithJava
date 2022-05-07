package com.qa.database.test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.devtools.Connection;

public class DataBaseTest {
/*  to perform database operations from eclipse download jdbc jar file from 
	oracle and add it  to project build path
	
	1. we need to establish the connection ny using (connection class)
	2. create a statement using (i.e query) statement class object
	3. execute the statement by using execute method
	4.finally close connection
*/
	public static void main(String[] args) throws SQLException {
				
		 // we don't require any path setup and driver initialization
		
		//step 1
		java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306","root","rootpassword");
		
		// 2. create statement
		
		Statement stmt = con.createStatement();
		
		// 3. execute sql statement
		
		String s = "insert into employee values(004, 'gangadhar', 96, 12111, 456789)";
		stmt.executeQuery(s);
		
		// close the connection
		
		con.close();
		System.out.println("program is executed");
		
		
		
	}

}
