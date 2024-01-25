package com.capgemini.Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Connection con =null;
   System.out.println("Hello Wrld");
   Class.forName("com.mysql.cj.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soyam","","");
		   System.out.println("Connection Established");
		   System.out.println(con.getClass().getName());
	}

}
