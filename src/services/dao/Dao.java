package services.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Dao {

	Connection getConnection() {
		String url = "jdbc:mysql://mysql-onf.alwaysdata.net/onf_bdd";

		Properties props = new Properties();
		props.setProperty("user", "onf");
		props.setProperty("password", "java2022");
		props.setProperty("ssl", "false");
		try {
			return DriverManager.getConnection(url, props);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	

	public void closeConnection(Connection connection, Statement statement) {
		try {
			if(statement!=null) {
				statement.close();
			}
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
