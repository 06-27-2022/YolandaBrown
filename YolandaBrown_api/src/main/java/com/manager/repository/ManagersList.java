package com.manager.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagersList {
	

	public static void main(String[] args) {

	Connection conn9 = null;
	String mgrsql="insert into managers values (?,?,?,?)";
	
	
	Managers mgr1 = new Managers("m108", "Cory", "Truesdale", "expcory01");
Managers mgr2 = new Managers("m107", "Barbara", "Barnes", "expbar01");

	{
	
	try {
		conn9 = DriverManager.getConnection(
				
				System.getenv("db_url_exp"),
				System.getenv("db_username"),
				System.getenv("db_password")
				);
	
	PreparedStatement stmt =conn9.prepareStatement(mgrsql);
	
	
     stmt.setString( 1, mgr1.getMgr_Num());
     stmt.setString(2, mgr1.getMgr_firstName());
     stmt.setString(3, mgr1.getMgr_lasttName());
     stmt.setString(4,mgr1.getMgr_approval_acct());
      
     stmt.setString( 1, mgr2.getMgr_Num());
     stmt.setString(2, mgr2.getMgr_firstName());
     stmt.setString(3, mgr2.getMgr_lasttName());
     stmt.setString(4,mgr2.getMgr_approval_acct());
     

     stmt.execute();
    
	
	System.out.println ("Data Inserted");
	 
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			conn9.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
	}
	
}
