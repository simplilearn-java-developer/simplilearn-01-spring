package com.simplilearn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class _03_ParametersController {

	@GetMapping("/parameters")
	ModelAndView parameters(@RequestParam("firstname") String firstName, 
			           @RequestParam("lastname") String lastName) {
		
		System.out.println("Rendering Parameters");
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		
		ModelAndView mv = new ModelAndView("parameters");
		mv.addObject("firstname", firstName);
		mv.addObject("lastname", lastName);
		
		return mv;
	}
	
}
