package connectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	public static void main(String[] args) {
		
	
	}//end of main
	
	
	public static Connection connectdb() {
		
		Connection connect = null;
		
		try {
			connect = DriverManager.getConnection(

					System.getenv("db_url_exp"),
					System.getenv("db_username"),
					System.getenv("db_password")
					);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return connect;
		
	}

		

}// end of class
