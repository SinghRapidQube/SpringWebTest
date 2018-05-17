package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {
	
	@RequestMapping("/about")
	public ModelAndView aboutPage() {
		
		return new ModelAndView("about");
	}
	
	@RequestMapping("/contact")
	public ModelAndView contactPage() {
		
		return new ModelAndView("contact");
	}
	
}
