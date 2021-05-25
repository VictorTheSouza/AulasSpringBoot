package org.generation.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController2 {
	
	@GetMapping("/hello2")
	public String hello() {
		
		return "Hello World" + "\n Pretendo aprender mais sobre o Spring Boot";
	}

}
