    package org.jdbc.muster;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class InsertRecord {

	    public static void main(String[] args) {
	        Connection con = null;
	        Statement stmt = null;
	        try {
	            // Step 1: Load and register the driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Step 2: Establish connection with database
	            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbcmust", "root","admin");
	            System.out.println("Connection Established ");

	            // Step 3: Create Statement  or Platform 
	            stmt = con.createStatement();

	           // Step 4: Write multiple insert queries
	            String q1 = "INSERT INTO student (id, name, age) VALUES (1, 'Rohit', 21)";
	            String q2 = "INSERT INTO student (id, name, age) VALUES (2, 'Ankit', 22)";
	            String q3 = "INSERT INTO student (id, name, age) VALUES (3, 'Karthik', 23)";

	           // Step 5: Execute the SQL queries
	            stmt.executeUpdate(q1);
	            stmt.executeUpdate(q2);
	            stmt.executeUpdate(q3);

	            System.out.println(" Records Inserted ");

	        } catch (ClassNotFoundException e) {
	            System.out.println("Connected jar");
	        } catch (SQLException e) {
	            System.out.println("Connected JDBC : " + e.getMessage());
	        } finally {
	            try {
	                // Step 6: Close connection or Costly resources
	                if (stmt != null) stmt.close();
	                if (con != null) con.close();
	            } catch (SQLException e) {
	                System.out.println("closing the costly resource : " + e.getMessage());
	            }
	        }
	    }
	}



