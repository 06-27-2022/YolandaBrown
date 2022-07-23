package util.dbConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {

	
	public static Connection getNewConnection() {
	
		
		
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(
						
						System.getenv("db_url_exp"),
						System.getenv("db_username"),
						System.getenv("db_password")
						);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			finally {
				
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			return conn;
		}//ends getnew Connection
	
}//ends class
	
	
	
	
	
	
			
		
			
			
	

			
				




