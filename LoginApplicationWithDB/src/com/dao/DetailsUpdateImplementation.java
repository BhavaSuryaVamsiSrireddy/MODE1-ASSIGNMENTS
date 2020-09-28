package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetailsUpdateImplementation implements DetailsUpdate {
	//In this we will get the details from the Login class so that we can update the values in database.
	int count = 0;
	
	@Override
	public int userDetailsUpdate(String userId, String field, String updatedValue) {
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement statement = connection
						.prepareStatement("update userdetails set " + field + " = ? where userid = ?");) {

			statement.setString(1, updatedValue);
			statement.setString(2, userId);
			count = statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int updateAge(String userId, int age) {
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement statement = connection
						.prepareStatement("update userdetails set age = ? where userid = ?");) {

			statement.setInt(1, age);
			statement.setString(2, userId);
			count = statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
