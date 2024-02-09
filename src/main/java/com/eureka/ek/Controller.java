package com.eureka.ek;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/api")
	public String api() {
		return "Hey , Its Working !!";
	}

}
