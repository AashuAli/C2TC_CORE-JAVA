package com.cg.jdbcsample;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;



public class Clinet {
	// CRUD- Creation,Retrieval,updation,Deletion
	// establish the connection

	public static void CreateEmployee() throws SQLException{
		Connection connection=DBUtil.getconnection();
		Statement stmt=connection.createStatement(); //create the query
		String insert = "insert into employees(name,salary,bonus)"+"values('Ali',3000.00,1000.00)";
		int execute=stmt.executeUpdate(insert); //exe the result in integer value
		if(execute==1) {
			System.out.println("entry is added");
		}
	}
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection=DBUtil.getconnection();
		if(connection!=null) {
		System.out.println("jdbc connection is established");
		CreateEmployee();
		}
	}

}
