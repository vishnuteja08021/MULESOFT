package mulesoft;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class viewrecords
{
public static void main(String args[])
{
try
{
	Connection con = null;

	Driver d = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	System.out.println("Driver Class Loaded");


	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishnu","root","root");
	
	Statement stmt1 = con.createStatement();
	
	String sql1 = "select * from topmovies";
	ResultSet rs = stmt1.executeQuery(sql1);
    while(rs.next()){
        System.out.print("Name: " + rs.getString("name"));
        System.out.print(", Actor: " + rs.getString("actor"));
        System.out.print(", Actress: " + rs.getString("actress"));
        System.out.println(", Director: " + rs.getString("director"));
        System.out.println(", Year of Release : " + rs.getInt("year_of_release"));
     }

	con.close();





}
catch(Exception e)
{
System.out.println(e);
}
}
}
