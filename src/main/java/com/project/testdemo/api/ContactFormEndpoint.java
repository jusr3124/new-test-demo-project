package com.project.testdemo.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.testdemo.domain.ContactForm;
import com.project.testdemo.persistence.ContactFormService;

@Path("contactForm")
@Component
public class ContactFormEndpoint {

	@Autowired
	private ContactFormService contactFormService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroup() {
		Iterable<ContactForm> contactForms = contactFormService.findAll();
		return Response.ok(contactForms).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postContactForm(ContactForm contactForm) {
		ContactForm result = contactFormService.save(contactForm);
		return Response.accepted(result.getId()).build();
	}
}
