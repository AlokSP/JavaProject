package alok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class JDBCConnection {
	
	public Statement getConnectionSet(int portNo, String dbName, String user, String password) throws SQLException{
		
		
		Connection con= DriverManager.getConnection("Jdbc:mysql://localhost:" + portNo +"/" + dbName, user, password );
			Statement st= con.createStatement();
			return st;
		}
		
	public ArrayList<Order> fetchData(ArrayList<Order> ordlist ,Statement st, String query, String orderID, String productName, String price ) throws SQLException{
		
		ResultSet rs= st.executeQuery(query);
		
		while(rs.next()) {
			ordlist.add(new Order(rs.getInt(orderID), rs.getString(productName), rs.getDouble(price)));
		}
		return ordlist;
	}
		
	}


