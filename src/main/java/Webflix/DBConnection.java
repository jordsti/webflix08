package Webflix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private String url;
	private String host;
	private String password;
	private String user;
	private String serviceName;
	
	public DBConnection()
	{
		url = "";
		host = "dijkstra.logti.etsmtl.ca";
		serviceName = "log660";
		user = "equipe8";
		password = "4WWFU3kB";
		
		buildUrl();
		
	}
	
	private void buildUrl()
	{
		url = "jdbc:oracle:thin:"+user+"/"+password+"@"+host+"/"+serviceName;
	}
	
	public Connection getConnection()
	{
		try {
			Connection c = DriverManager.getConnection(url);
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
