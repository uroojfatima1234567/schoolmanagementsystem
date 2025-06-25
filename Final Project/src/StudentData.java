import java.sql.*;
import javax.swing.*;
public class StudentData {
	
	//Step 1 Register the Driver Class
	//Step 2 Creating the Connection
	//Step 3 Creating Statement
	//Step 4 Executing MySQL queries
	
	
	public static Connection ConnectDB(){
		
			try 
			{
			
				Class.forName("com.mysql.cj.jdbc.Driver");	//Step 1
				Connection c=DriverManager.getConnection
						("jdbc:mysql:D:\\Eclipse\\Final Project2\\Database\\Database3.sql"); //Step 2
				return c;
			
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
			
	
	}
	
	
}
