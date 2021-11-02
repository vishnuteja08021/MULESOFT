package mulesoft;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import java.sql.Statement;

public class Createtables
{
public static void main(String args[])
{
try
{
	Connection con = null;

	Driver d = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	System.out.println("Class Loaded sucessfully");


	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishnu","root","root");
	System.out.println("Connection established");
	Statement stmt = con.createStatement();
	String sql = "CREATE TABLE topmovies " +
            "(name VARCHAR(255), " + " actor VARCHAR(255), " + " actress VARCHAR(255), " + " director VARCHAR(255), "+ " year_of_release INTEGER, " + " PRIMARY KEY (name ))"; 
    stmt.executeUpdate(sql);
    System.out.println("Table created successfully...");
	con.close();



	con.close();



}
catch(Exception e)
{
System.out.println(e);
}
}
}
