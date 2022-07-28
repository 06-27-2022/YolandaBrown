package com.managerLogIn;
import com.managerLogIn.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Managers_Login {

	public static void main(String[] args) {
		
		
		ManagerLogin mgr1= new ManagerLogin("barrevmgr", "bar123", "expbar01");
		ManagerLogin mgr2= new ManagerLogin("carrevmgr", "car123", "expcar01");
		
		
		
		Connection conn11 = null;
		
		String mgrlogin="insert into mgrlogin(mgr-username,mgr-password,mgr-expid) values (?,?,?)";
	
		try {
			conn11 = DriverManager.getConnection(
					
					System.getenv("db_url_exp"),
					System.getenv("db_username"),
					System.getenv("db_password")
					);
			
			PreparedStatement mlogin =conn11.prepareStatement(mgrlogin);
			
			mlogin.setString(1, mgr1.getMgrUserName());
			mlogin.setString(2, mgr1.getMgrPassword());
			mlogin.setString(3, mgr1.getMgrExpenseId());
			
			
			mlogin.setString(1, mgr2.getMgrUserName());
			mlogin.setString(2, mgr2.getMgrPassword());
			mlogin.setString(3, mgr2.getMgrExpenseId());
			
			mlogin.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				conn11.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
