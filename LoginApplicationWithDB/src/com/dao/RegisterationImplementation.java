package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.UserDetails;

public class RegisterationImplementation implements Registration {
	//In this class we store the user details in a database.
	int count = 0;
	
	@Override
	public boolean register(UserDetails user) {
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement statement = connection
						.prepareStatement("insert into userdetails values(?,?,?,?,?,?)");) {

			statement.setString(1, user.getUserId());
			statement.setString(2, user.getFirstName());
			statement.setString(3, user.getLastName());
			statement.setString(4, user.getPassword());
			statement.setInt(5, user.getAge());
			statement.setString(6, user.getGender());
			count = statement.executeUpdate();
			if (count == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
