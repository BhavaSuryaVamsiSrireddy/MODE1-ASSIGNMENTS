package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.model.UserDetails;

public class LoginValidationImplementation implements LoginValidation {

	//In this class we will validate the credentials with data present in database if the user is valid means we will return userObject that 
	//contains the details else null.
	UserDetails user = new UserDetails();
	ResultSet resultSet = null;
	@Override
	public UserDetails validation(String userId, String password) {
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement statement = connection.prepareStatement("select * from userdetails where userid = ?");
				) {
			statement.setString(1, userId);
			resultSet = statement.executeQuery();

			if (resultSet.next()) {
				if (password.equals(resultSet.getString("password"))) {
					user.setAge(resultSet.getInt("age"));
					user.setFirstName(resultSet.getString("firstname"));
					user.setGender(resultSet.getString("gender"));
					user.setLastName(resultSet.getString("lastname"));
					user.setUserId(userId);
					return user;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}
