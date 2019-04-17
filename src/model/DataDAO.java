package model;

import java.sql.*;
import java.util.ArrayList;

public class DataDAO {
	public ArrayList<Datamodel> getall() throws SQLException
	{
	
		ArrayList<Datamodel> list = new ArrayList<Datamodel>();
		Connection conn = DBUtils.getConnection();
		Statement pp = (Statement) conn.createStatement();
		String sql = "select * from data_tb";
		ResultSet rs = pp.executeQuery(sql);
		while (rs.next()) {
			Datamodel data = new Datamodel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			list.add(data);	
		}
		return list;
	}
	public ArrayList<Datamodel> getId(String id) throws SQLException
	{
		int Id = Integer.parseInt(id);
		ArrayList<Datamodel> list = new ArrayList<Datamodel>();
		Connection conn = DBUtils.getConnection();
		Statement pp = (Statement) conn.createStatement();
		String sql = "select * from data_tb where id="+Id+"";
		ResultSet rs = pp.executeQuery(sql);
		while (rs.next()) {
			Datamodel data = new Datamodel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			list.add(data);	
		}
		return list;
	}
}
