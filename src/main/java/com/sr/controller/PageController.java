package com.sr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/calendar")
	public String calendar() {
		return "calendar";
	}
	@RequestMapping("/createProduct")
	public String createProduct() {
		return "layout/product/create";
	}
	
	
}
