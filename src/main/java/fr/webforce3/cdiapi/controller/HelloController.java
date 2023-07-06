package fr.webforce3.cdiapi.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloController {

	@GET
	public String helloGet() {
		return "Hello World";
	}

}
