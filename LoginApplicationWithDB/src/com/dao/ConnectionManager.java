package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	//This class is for establishing the  database connection.
	static Connection connection = null;
	static String url = "jdbc:mysql://localhost/loginapplication";
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,"root", "");
		}
		catch (SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
