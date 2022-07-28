package util.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnection2 {

	
		
		
		
		public static Connection getNewConnection1() {
			
			Connection conn4 = null;
			try {
				conn4 = DriverManager.getConnection(
						
						System.getenv("db_url_exp"),
						System.getenv("db_username"),
						System.getenv("db_password")
						);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return conn4;			
		}
			
		
		
			
		}// end of class

