package com.painsk5.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/") 
	@ResponseBody
	public String getHome() {
		return "welcome";
	}
}
