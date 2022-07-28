package com.employeeLogIn;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class Employee_Login {
	

	public static void main(String[] args) {
		
			
		
		
		
	Connection conn121 = null;
	String stafflogin="insert into emp_login values (?,?,?)";
	
	EmployeeLogIn emp_Barbara = new EmployeeLogIn("barrev", "rev123", 100);
	EmployeeLogIn emp_Patrick = new EmployeeLogIn("patrev", "rev123", 101);
	EmployeeLogIn emp_Cory = new EmployeeLogIn("correv", "rev123", 102);
	EmployeeLogIn emp_Carolyn = new EmployeeLogIn("carrev", "rev123", 103);

		 
	try {
		
		conn121 = DriverManager.getConnection(
				
				System.getenv("db_url_exp"),
				System.getenv("db_username"),
				System.getenv("db_password")
				);
		
		
		PreparedStatement login =conn121.prepareStatement(stafflogin);
		
		login.setString( 1, emp_Barbara.getUserName());
		login.setString(2,emp_Barbara.getPassword());
		login.setInt(3, emp_Barbara.getEmployeeid());
		
		login.setString( 1,emp_Patrick.getUserName());
		login.setString(2,emp_Patrick.getPassword());
		login.setInt(3, emp_Patrick.getEmployeeid());
		
		login.setString( 1, emp_Cory.getUserName());
		login.setString(2,emp_Cory.getPassword());
		login.setInt(3, emp_Cory.getEmployeeid());
		
		login.setString( 1, emp_Carolyn.getUserName());
		login.setString(2,emp_Carolyn.getPassword());
		login.setInt(3,emp_Carolyn.getEmployeeid());
		
	    login.executeUpdate();
	    
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		finally {
			try {
				conn121.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}
}



