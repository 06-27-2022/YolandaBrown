package util.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatbaseeConnection1 {
	




		
		public static Connection getNewConnection() {
		
			
			
				Connection conn7 = null;
				try {
					conn7 = DriverManager.getConnection(
							
							System.getenv("db_url_exp"),
							System.getenv("db_username"),
							System.getenv("db_password")
							);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				
			
				return conn7;
			}//ends getnew Connection
}
