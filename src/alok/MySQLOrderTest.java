package alok;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQLOrderTest {

	public static void main(String[] args) throws SQLException {
		
		JDBCConnection obj= new JDBCConnection();
		ArrayList<Order> ordlist= new ArrayList<>();
		Statement st;
		st= obj.getConnectionSet(3306, "mydb", "root", "1234");
		
		String query= "Select * from Order";
		
		ordlist= obj.fetchData(ordlist, st, query, "OrderID", "ProductName", "Price");
		
		for(Order ord: ordlist) {
			System.out.println(ord.orderID +" "+ ord.productName+" " + ord.price);
		}
		
		

	}

}
