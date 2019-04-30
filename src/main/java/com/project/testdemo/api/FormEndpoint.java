package com.project.testdemo.api;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.testdemo.persistence.FormService;

@Path("form")
@Component
public class FormEndpoint {

	@Autowired
	private FormService formService;
	
	
	
}
