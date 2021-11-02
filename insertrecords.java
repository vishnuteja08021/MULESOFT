package mulesoft;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import java.sql.Statement;

public class insertrecords
{
public static void main(String args[])
{
try
{
	Connection con = null;

	Driver d = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	System.out.println("Driver Class Loaded sucessfully");


	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishnu","root","root");
	System.out.println("Connection established");
	Statement stmt1 = con.createStatement();
	Statement stmt2 = con.createStatement();
	Statement stmt3 = con.createStatement();
	String sql1 = "insert into topmovies values('Romantic','Akashpuri','Keetikasharma','puri jagannath',2021)";
	String sql2 = "insert into topmovies values('RX 100','kathikeya','payalrajput','Ashok reddy',2018)";
	String sql3 = "insert into topmovies values('Arjunreddy','vijaydevarakonda','shalinipandey','praneyreddy',2017)";
    stmt1.executeUpdate(sql1);
    stmt2.executeUpdate(sql2);
    stmt3.executeUpdate(sql3);
    System.out.println("Records inserted successfully.....");
	con.close();



	con.close();



}
catch(Exception e)
{
System.out.println(e);
}
}
}
