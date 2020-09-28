package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.UserDetails;

public class DisplayUserDetailsImplementation implements DisplayUserDetails {

	//In this we will get the userId from the Login class so that we can retrieve the values from the database and send it to Login class to display.
	UserDetails user = new UserDetails();
	ResultSet resultSet = null;
	@Override
	public UserDetails getUserDetails(String userId) {
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement statement = connection.prepareStatement("select * from userdetails where userid = ?");
				 ) {

			statement.setString(1, userId);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				user.setAge(resultSet.getInt("age"));
				user.setFirstName(resultSet.getString("firstname"));
				user.setGender(resultSet.getString("gender"));
				user.setLastName(resultSet.getString("lastname"));
				user.setUserId(userId);
				return user;
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
		return user;
	}

}
