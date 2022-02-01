package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnect {

	private static Connection connection = null;
	
	public static Connection getConnecttion() {
		Properties p = new Properties();
		try {
			if(connection == null  || connection.isClosed()) {
				p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));

		        String classForname = p.getProperty("classForname");
		        String url = p.getProperty("url") + "//" + p.getProperty("host") + ":" + p.getProperty("port") + "/" + p.getProperty("db");
		        String username = p.getProperty("user_db");
		        String password = p.getProperty("password_db");
				
				
				Class.forName(classForname);
				connection = DriverManager.getConnection(
						url,		
						username,	
						password);
				//System.out.println(url + " - username: " + username + " password: " + password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;					
	}

}
