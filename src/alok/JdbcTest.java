package alok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection between java application with MYSQL database
		
		Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/mydb", "root", "1234");
		
		// Create Statement Object
		
		Statement st= con.createStatement();
		
		ResultSet rs;
		
		rs=st.executeQuery("Select * from Employee Order By EmpName ");
		
		while(rs.next()) {
			System.out.println(rs.getString("EmpID")+"  "+ rs.getString("EmpName") +"  " + rs.getString("EmpSalary"));
			
		}
	}

}
