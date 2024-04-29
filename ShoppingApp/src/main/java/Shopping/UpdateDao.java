package Shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDao {

	public int k=0;
	
	public int update(ProductBean pb, int qty) {
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("update product59 set qty=? where pid=?");
			if(qty>pb.getQty()) {
				
				ps.setInt(1, 0);
				ps.setString(2, pb.getPid());
				
				k=ps.executeUpdate();
				
				
				
			}else {
				
				ps.setInt(1, pb.getQty()-qty);
				ps.setString(2, pb.getPid());
				
				k=ps.executeUpdate();
			}
		    
			
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return k;
	}

}
