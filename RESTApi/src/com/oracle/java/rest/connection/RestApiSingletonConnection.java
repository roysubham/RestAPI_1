package com.oracle.java.rest.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class RestApiSingletonConnection {
	
	static Connection con=null;
	
		
	public static Connection getConnetion(){
		try{
		con= DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:sid", "username",
				"password");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}

}
