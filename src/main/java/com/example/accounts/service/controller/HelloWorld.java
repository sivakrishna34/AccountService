package com.example.accounts.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class HelloWorld {

	@RequestMapping(value = "/message", method = RequestMethod.GET, produces = "application/json")
	public String getMessage(){
		return "Hello World";
	}
}
