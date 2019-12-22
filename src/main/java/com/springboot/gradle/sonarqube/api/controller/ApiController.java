package com.springboot.gradle.sonarqube.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding-standards")
public class ApiController {

	public static final String PONG_MESSAGE = "pong";
	
	@GetMapping("/ping")
	public String ping() {
		return PONG_MESSAGE;
	}
}
