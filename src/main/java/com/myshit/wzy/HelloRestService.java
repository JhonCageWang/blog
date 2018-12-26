package com.myshit.wzy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hellow")
public class HelloRestService {
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		String out = "this shit is shit"+ msg;
		return Response.status(200).entity(out).build();
		
	}

}
