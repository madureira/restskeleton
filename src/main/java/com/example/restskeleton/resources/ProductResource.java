package com.example.restskeleton.resources;

import static com.example.restskeleton.enumerations.ContentType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.restskeleton.models.Product;
import com.example.restskeleton.models.SuccessMessage;
import com.example.restskeleton.services.ProductService;

@Component
@Path("/product")
@Produces(APPLICATION_JSON)
public class ProductResource {

	@Autowired
	private ProductService service;

	@GET
	@Path("/")
	public Response index() {
		SuccessMessage message = new SuccessMessage("Endpoint of product works");

		return status(200).entity(message).build();
	}

	@GET
	@Path("/{id}")
	public Response searchById(@PathParam("id") Integer id) {
		Product product = this.service.getById(id);

		return status(200).entity(product).build();
	}

}
