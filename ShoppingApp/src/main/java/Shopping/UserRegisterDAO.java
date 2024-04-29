package Shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRegisterDAO {
	
	public int k=0;
	public int register(UserBean ub) {
		
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into user59 values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getPword());
			ps.setString(3,ub.getFname());
			ps.setString(4, ub.getLname());
			ps.setString(5, ub.getMid());
			ps.setLong(6, ub.getPhno());
			ps.setString(7, ub.getAddr());
			
			k=ps.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
	

}
