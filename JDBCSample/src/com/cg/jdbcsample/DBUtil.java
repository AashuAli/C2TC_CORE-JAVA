package com.cg.jdbcsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String db_driverclass="com.mysql.cj.jdbc.Driver"; //drive.class from ref lib.........
	private static final String db_username="root";
	private static final String db_password="1hk16cs002";
	private static final String db_url="jdbc:mysql://localhost:3306/jdbcsample";
	private static Connection conn=null; // for not effecting the result
	static { //exe before main method
		try {
	Class.forName(db_driverclass); //load the driver class
	conn=DriverManager.getConnection(db_url,db_username,db_password);
		} catch(ClassNotFoundException | SQLException e) {
	e.printStackTrace(); //give runtime exception
		}
	}
	public static Connection getconnection() { //return connection obj
		return conn;
	}
}
