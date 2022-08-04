package com.loginRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectionUtil.Connect;

public class LoginInfo {

	public static void main(String[] args) throws SQLException {
		
		
		Connection conn=null;
		PreparedStatement stmt =null;
		
		final String STAFFLOGIN="insert into emplogin values(?,?,?,?)";
		
			
		conn=Connect.connectdb();
		try {
			stmt =conn.prepareStatement(STAFFLOGIN);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//populate data
		
		
		LoginModel emp1 =new LoginModel(1, "barrev", "rev123","mgr");
		LoginModel emp2 =new LoginModel(2, "coryrev","rev123","staff");
		LoginModel emp3= new LoginModel(3,"jamesrev","rev123","staff");
		
		stmt.setInt(1, emp1.getEmpid());
		stmt.setString(2, emp1.getUserName());
		stmt.setString(3, emp1.getPassword());
		stmt.setString(4, emp1.getEmproles());
		stmt.executeUpdate();
		
		stmt.setInt(1, emp2.getEmpid());
		stmt.setString(2, emp2.getUserName());
		stmt.setString(3, emp2.getPassword());
		stmt.setString(4, emp2.getEmproles());
		stmt.executeUpdate();
		
		stmt.setInt(1, emp3.getEmpid());
		stmt.setString(2, emp3.getUserName());
		stmt.setString(3, emp3.getPassword());
		stmt.setString(4, emp3.getEmproles());
		stmt.executeUpdate();
		
		
	System.out.println("done");

	}

}
