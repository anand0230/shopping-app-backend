package Shopping;
import java.sql.*;

import java.sql.Connection;

public class DBConnection {
	
	public static Connection con=null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			con=DriverManager.getConnection(DBinfo.DBurl,DBinfo.uName,DBinfo.pword);
			
		}catch(Exception e){
			e.printStackTrace();
	}
		
	}
	
	public static Connection getCon() {
		return con;

}
}
