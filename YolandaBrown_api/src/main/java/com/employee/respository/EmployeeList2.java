package com.employee.respository;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class EmployeeList2 {

	
	public static void main(String[] args) {
		
		Connection conn8 = null;
		String staffsql="insert into employee values (?,?,?,?)";

		
		
		Employee emp1 =new  Employee(100, "Barbara", "Barnes", 1000);
		Employee emp2 =new  Employee(101, "Patrick", "Jackson", 1001);
		Employee emp3 =new  Employee(102, "Steve", "James", 1002);
				
		//ask why only updating 1 record
		Employee emp4 =new  Employee(103, "Carolyn", "Truesdale", 1003);
		
		
		try {
			conn8 = DriverManager.getConnection(
					
					System.getenv("db_url_exp"),
					System.getenv("db_username"),
					System.getenv("db_password")
					);
		
		PreparedStatement stmt =conn8.prepareStatement(staffsql);
		
		
	     stmt.setInt( 1, emp1.getEmployeeId());
	     stmt.setString(2, emp1.getEmp_FirstName());
	     stmt.setString(3, emp1.getEmp_LastName());
	     stmt.setInt(4,emp1.getEmp_ExpAccount());
	      
	     stmt.setInt( 1, emp2.getEmployeeId());
	     stmt.setString(2, emp2.getEmp_FirstName());
	     stmt.setString(3, emp2.getEmp_LastName());
	     stmt.setInt(4,emp2.getEmp_ExpAccount());
	     
	     stmt.setInt( 1, emp3.getEmployeeId());
	     stmt.setString(2, emp3.getEmp_FirstName());
	     stmt.setString(3, emp3.getEmp_LastName());
	     stmt.setInt(4,emp3.getEmp_ExpAccount());
	     
	     stmt.setInt( 1, emp4.getEmployeeId());
	     stmt.setString(2, emp4.getEmp_FirstName());
	     stmt.setString(3, emp4.getEmp_LastName());
	     stmt.setInt(4,emp4.getEmp_ExpAccount());
	     stmt.executeUpdate();
	
		System.out.println ("Data Inserted");
		 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn8.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	


}
	
}
