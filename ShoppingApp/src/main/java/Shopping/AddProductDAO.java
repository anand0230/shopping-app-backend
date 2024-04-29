package Shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO {

	public int k=0;
	public int addproduct(ProductBean pb) {
		
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into product59 values(?,?,?,?)");
			ps.setString(1, pb.getPid());
			ps.setString(2, pb.getPname());
			ps.setDouble(3, pb.getPrice());
			ps.setInt(4, pb.getQty());
			k=ps.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return k;
	}

}
