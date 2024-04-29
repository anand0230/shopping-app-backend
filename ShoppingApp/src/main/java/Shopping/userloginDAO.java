package Shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userloginDAO {
	
	public UserBean ub=null;

	public UserBean login(String uname, String pword) {
		
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from user59 where uname=? and pword=?");
			
			ps.setString(1, uname);
			ps.setString(2, pword);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ub=new UserBean();
				ub.setUname(rs.getString(1));
				ub.setPword(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setMid(rs.getString(5));
				ub.setPhno(rs.getLong(6));
				ub.setAddr(rs.getString(7));
				
			}
			
					
			
		}catch(Exception e){
          e.printStackTrace();
		}
		
		
		return ub;
	}

}
