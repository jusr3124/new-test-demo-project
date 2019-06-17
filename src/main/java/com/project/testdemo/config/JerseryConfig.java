package com.project.testdemo.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.project.testdemo.api.ContactFormEndpoint;

@Component
@ApplicationPath("/api")
public class JerseryConfig extends ResourceConfig {
	public JerseryConfig() {
		register(ContactFormEndpoint.class);
	}
}
