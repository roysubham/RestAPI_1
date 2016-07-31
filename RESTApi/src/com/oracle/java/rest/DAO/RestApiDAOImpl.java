package com.oracle.java.rest.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.java.rest.connection.RestApiSingletonConnection;
import com.oracle.java.rest.model.RestApiMvcModel;

public class RestApiDAOImpl implements RestApiDAO{

	public RestApiMvcModel getJsonRepsonse() {
		
		// Using JDBC 
		Connection con=RestApiSingletonConnection.getConnetion();
		ResultSet rs=null;
		String value=null;
		RestApiMvcModel model=new RestApiMvcModel();
		/*try {
			PreparedStatement st=con.prepareStatement("select value from table_name where id=?");
			st.setString(1, "1234");
			rs=st.executeQuery();
			if(rs.next()){
				value=rs.getString(1);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		model.setValue(value);*/
		model.setValue("It works");
		return model;
	}

}
