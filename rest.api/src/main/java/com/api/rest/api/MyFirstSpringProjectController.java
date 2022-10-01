package com.api.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstSpringProjectController {

	@GetMapping("hello")
	public 	String helloProject()
		{
			return "Hello world";
		}
}
