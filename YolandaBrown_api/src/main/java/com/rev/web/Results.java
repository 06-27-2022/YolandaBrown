package com.rev.web;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.employeeLogIn.EmployeeLogIn;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Results {

	public static void main(String[] args) {
	
		
		
		Connection conn13 = null;
		Statement stmt2 = null;
		
		
		
		 
		
		 String  login=("SELECT emp_username, emp_password FROM emp_login");
		
		
		
try {
			
			conn13 = DriverManager.getConnection(
					
					System.getenv("db_url_exp"),
					System.getenv("db_username"),
					System.getenv("db_password")
					);
		
			stmt2 =conn13.createStatement();
			ResultSet results=stmt2.executeQuery(login);
			
		
			
			while (results.next()) {
				
				String userName =results.getString(1);
				String password =results.getString(2);
				
				
				
				
				
			
			System.out.println(results.getString(1));			
			System.out.println(results.getString(2));
				
				
			}
						
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			finally {
				
				try {
					conn13.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			
	
			
			}

		

	
			
		
}

