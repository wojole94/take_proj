package pl.woleszko.webservice.impl;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/users")
public interface RestAPI {

	@GET
	@Path("/{id}")
	@Produces({"application/xml", "application/json"})
	public Object getUser(@PathParam("id") Long id);
	

	@GET
	@Path("/")
	@Produces({"application/xml","application/json"})
	public LinkedList<Object> getAll();
	
	@POST
	@Path("/")
	@Consumes({"application/xml","applicaton/json"})
	@Produces({"application/xml", "application/json"})
	public Response addNew(Object user);
	
	@DELETE
	@Path("/{id}")
	public Response deleteUser(@PathParam("id") Long id);
	
	@PUT
	@Path("/{id}")
	@Consumes({"application/xml","applicaton/json"})
	@Produces({"application/xml", "application/json"})
	public Response editUser(@PathParam("id") Long id, Object user);
	


	
}