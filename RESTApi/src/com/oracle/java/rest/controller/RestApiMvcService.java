package com.oracle.java.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.oracle.java.rest.DAO.RestApiDAOImpl;
import com.oracle.java.rest.model.RestApiMvcModel;

@Path("/works")
public class RestApiMvcService {
	
	@GET
	@Produces("application/json")
	public RestApiMvcModel getJsonResponse(){
		RestApiDAOImpl dao=new RestApiDAOImpl();
		return dao.getJsonRepsonse();
		
	}

}
