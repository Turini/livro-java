package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		String url = "jdbc:mysql://localhost/livraria";
		try {
			return DriverManager.getConnection(url, "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
