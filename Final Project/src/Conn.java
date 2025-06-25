import java.sql.*;

public class Conn {
	
	//Step 1 Register the Driver Class
	//Step 2 Creating the Connection
	//Step 3 Creating Statement
	//Step 4 Executing MySQL queries
	
	Connection c;
	Statement s;
	Conn(){
		
			try 
			{
			
				Class.forName("com.mysql.cj.jdbc.Driver");	//Step 1
				c=DriverManager.getConnection("jdbc:mysql:///schoolmanagementsystem","root","root"); //Step 2
				s=c.createStatement();	//Step 3
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
	
	}
	
	
}
