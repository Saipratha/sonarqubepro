package com.springboot.dockerdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class controller {
	
	@GetMapping("/test-docker")
	public String getData() {
		return  "mydocker_file";
	}
	
	

}