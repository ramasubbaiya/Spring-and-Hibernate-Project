package com.rama.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyConstructor {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}
