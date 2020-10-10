package com.gsrd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	@RequestMapping("/hello")
	public String printHello() {
		return "home";
	}
}
