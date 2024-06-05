package com.gl.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("hello from spring boot");
		System.out.println("Hi hello from from from spring boot");
		return "Hello from Spring Boot!";
	}

}
