package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Sample2Controller {
	
	@RequestMapping(method=RequestMethod.GET, value="hello")
	public String sayHello(){
		return "Hi , Welcome to Service2";
	}
	@RequestMapping(method=RequestMethod.GET, value="admin")
	public String sayHelloAdmin(){
		return "Hi , Welcome to Service2 Admin";
	}
}
