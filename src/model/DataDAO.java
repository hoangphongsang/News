package model;

import java.sql.*;
import java.util.ArrayList;

public class DataDAO {
	public ArrayList<Datamodel> getall() throws SQLException
	{
		System.out.println("aaaaaaaaaaaa");
		ArrayList<Datamodel> list = new ArrayList<Datamodel>();
		Connection conn = DBUtils.getConnection();
		Statement pp = (Statement) conn.createStatement();
		String sql = "select * from data_tb";
		ResultSet rs = pp.executeQuery(sql);
		while (rs.next()) {
			Datamodel data = new Datamodel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			list.add(data);
			
		}
	//		if(conn == null)
	//		{
	//			return list;
	//		}
//	//		
//		try {
//			pp = conn.prepareStatement("select * from data_tb");
//			rs = pp.executeQuery();
//			while(rs.next())
//			{
//				Datamodel data = new Datamodel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
//				list.add(data);
//			}
//		}
//		catch(SQLException ex) {
//			
//		}
//		finally
//		{
//			DBUtils.freeConnection(conn);
//		}
//		
//		
		
		return list;
	}
}
