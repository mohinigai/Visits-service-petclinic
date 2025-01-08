package com.task.configue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import jakarta.servlet.ServletContext;
@Configuration
public class Myconfiguration {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
	
	 @Bean
	    public ServletContext servletContext() {
	        return new MockServletContext(); // Use MockServletContext if not running inside a servlet container
	    }
	

}
