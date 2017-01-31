package com.stk.ecom.java.academy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(value = "")
	public String home(){
		return "index";
	}
}
