package com.employee.respository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import util.dbConnection.DatabaseConnection;

public class EmployeeList {
	
	public static void main (String[] args) throws SQLException {

		
	
		//Sql String to make Employee table
		
		//Reminder to close these
		Connection conn = null;
		Connection conn2=null;
		Connection conn3=null;
		Connection conn4=null;
		Connection conn5=null;
		
		Statement stmt = null;
		Statement stmt1 =null;
		Statement stmt2=null;
		Statement stmt3=null;
		Statement stmt4=null;

		
		
		final String emp_table_creation ="CREATE TABLE Employee() ";
		final String emp_column_creation="ALTER TABLE Employee ADD COLUMN EmployeeId Int NOT NULL ";
		final String emp_columns_creation="ALTER TABLE Employee ADD COLUMN Emp_FirstName VARCHAR(25) NOT NULL ";
		final String emp_columns_creation1="ALTER TABLE Employee ADD COLUMN Emp_LastName VARCHAR(25) NOT NULL ";
		final String emp_columns_creation2="ALTER TABLE Employee ADD COLUMN Emp_ExpAccount Int NOT NULL ";
		
		
	
	   conn=DatabaseConnection.getNewConnection();
	   stmt =conn.createStatement();
       stmt.execute(emp_table_creation);
	
		
    	conn2=DatabaseConnection.getNewConnection();
		stmt1 =conn2.createStatement();
     	stmt1.execute(emp_columns_creation);

		
	    conn3=DatabaseConnection.getNewConnection();
  	    stmt3 =conn3.createStatement();
    	stmt3.execute(emp_columns_creation1);
	
		
		
    	conn4=DatabaseConnection.getNewConnection();
    	stmt4 =conn4.createStatement();
    	stmt4.execute(emp_columns_creation2);
		
		
		
		


//	
		
	}//end of main
	
}//end of class
