package org.jdbc.muster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_Connections {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// Step 1 Load and resister the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step 2 Establish the connection b/w DB server
		
		Connection con= DriverManager.getConnection ("jdbc:mysql://localhost:3306/jdbcmust" ,"root", "admin");
	                    System.out.println("Connection Created");
	                    con.close();
		
		
	}

}
