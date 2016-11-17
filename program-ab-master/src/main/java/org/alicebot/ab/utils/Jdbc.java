package org.alicebot.ab.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public void insert(String name){
		try (
		         // Step 1: Allocate a database "Connection" object
		         Connection conn = DriverManager.getConnection(
		               "jdbc:mysql://localhost:3306/People?useSSL=false", "bernardo", "120491"); // MySQL
		 
		         // Step 2: Allocate a "Statement" object in the Connection
		         Statement stmt = conn.createStatement();
		      ) {
		         // Step 3: Execute a SQL SELECT query, the query result
		         //  is returned in a "ResultSet" object.
				 String strSelect = "insert into PersonalInfo (Name) values ('" + name + "')";
		         System.out.println("The SQL query is: " + strSelect); // Echo For debugging
		         System.out.println();
		 
		         stmt.execute(strSelect);
		 
		         // Step 4: Process the ResultSet by scrolling the cursor forward via next().
		         //  For each row, retrieve the contents of the cells with getXxx(columnName).
		         System.out.println("The records selected are:");
		         
		 
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
	}
	
	public int checkIfExists(String attribute, String value){
		try (
		         // Step 1: Allocate a database "Connection" object
		         Connection conn = DriverManager.getConnection(
		               "jdbc:mysql://localhost:3306/People?useSSL=false", "bernardo", "120491"); // MySQL
		 
		         // Step 2: Allocate a "Statement" object in the Connection
		         Statement stmt = conn.createStatement();
		      ) {
		         // Step 3: Execute a SQL SELECT query, the query result
		         //  is returned in a "ResultSet" object.
				 String strSelect = "select * from PersonalInfo where " + attribute + " = '" + value + "'";
		         System.out.println("The SQL query is: " + strSelect); // Echo For debugging
		         System.out.println();
		 
		         ResultSet result = stmt.executeQuery(strSelect);
		 
		         int rowCount = result.last() ? result.getRow() : 0;
		         
		         return rowCount;
		        
		 
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
		return 0;
	}

}
