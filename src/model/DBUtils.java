package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtils {
	 private static String DB_URL = "jdbc:mysql://localhost/news";
	    private static String USER_NAME = "root";
	    private static String PASSWORD = "hoangphongsang98";
	    
	    public static Connection getConnection() {
	        Connection conn = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        
	            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	            System.out.println("connect successfully!");
	        } catch (Exception ex) {
	            System.out.println("connect failure!\n" + ex.toString());
	            ex.printStackTrace();
	        }
	        return conn;
	    }

	 
	    public static void freeConnection(Connection con) {
	        try {
	            con.close();
	        } catch (SQLException ex) {
	          System.out.println("huy deo duoc " + ex.toString());
	        }
	    }
	 
}