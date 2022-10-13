package com.crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrudAppController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
