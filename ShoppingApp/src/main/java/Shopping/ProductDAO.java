package Shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
	
	public ArrayList<ProductBean> al=null;

	public ArrayList<ProductBean> getproduct() {
		
		try {
			
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from product59");
			
			ResultSet rs=ps.executeQuery();
			
			al=new ArrayList<ProductBean>();
			while(rs.next()) {
				ProductBean pb=new ProductBean();
				pb.setPid(rs.getString(1));
				pb.setPname(rs.getString(2));
				pb.setPrice(rs.getDouble(3));
				pb.setQty(rs.getInt(4));
			      al.add(pb);
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return al;
	}

}
