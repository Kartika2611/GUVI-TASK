package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JD
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Data base connection details
		String db_url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "root";
		
		//database connection
		try {
		Connection connection = DriverManager.getConnection(db_url, user, password);
		
		//validating the connection
		if(connection != null) {
			System.out.println("The database connection was successful");
		}else {
			System.out.println("The database connection was unsuccessful");
		}
		
		//Creating reference to statement
		Statement statement = connection.createStatement();
		
		String createDB = "create database employeeDatabase2";
		String use = "Use employeeDatabase2";
		String createTable = "create table empTable(empcode int,empname varchar(20),empage int,esalary int)";
		String select = "Select * from empTable";
		String insert = "insert into empTable values(101,'Jenny',25,10000)," + "(102,'Jacky',30,20000)," + "(103,'Joe',20,40000)," + "(104,'John',40,80000)," + "(105,'Shameer',25,90000)";
		
		//Executing create DB query
		statement.execute(createDB);
		
		//Executing use DB query
		statement.execute(use);
		
		//Executing create Table query
		statement.execute(createTable);
		
		//Executing the insert table query
		statement.execute(insert);
		
		//Executing the select query to display all records of the table
		ResultSet rs = statement.executeQuery(select);
		
		
		//Using while loop to iterate the database results to console
		while(rs.next())
		{
			System.out.println(rs.getInt("empcode")+" "+rs.getString("empname")+" "+rs.getInt("empage")+" "+rs.getInt("esalary"));
		}
		
		//Closing the database connection
		connection.close();
		
		}catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}

}