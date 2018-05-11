package br.gov.rn.parnamirim.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/exemplo")
public class ExemploRest {
	
	@Path("/teste")
	@GET //metodo http
	@Produces({MediaType.TEXT_PLAIN})
	public Response teste() {
		return Response.status(200).entity("Deu certo!").build();
	}

}
