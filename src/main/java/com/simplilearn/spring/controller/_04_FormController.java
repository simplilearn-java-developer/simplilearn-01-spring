package com.simplilearn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class _04_FormController {

    @GetMapping("/user/form")
    String showForm() {
        System.out.println("Rendering User Form");

        /* return the template's name without the extension */
        return "user_form";
    }

    @PostMapping("/user/table")
    String showTable(HttpServletRequest req, Model model) {
    	System.out.println("Rendering User Table");
    	
    	String firstName = req.getParameter("firstname");
    	String lastName = req.getParameter("lastname");
    	String email = req.getParameter("email");
    	String birth = req.getParameter("birth");
    	
    	System.out.println("First Name: " + firstName);
    	System.out.println("Last Name: " + lastName);
    	System.out.println("Email: " + email);
    	System.out.println("Birth: " + birth);
    	
    	model.addAttribute("firstname", firstName);
    	model.addAttribute("lastname", lastName);
    	model.addAttribute("email", email);
    	model.addAttribute("birth", birth);
    	
    	/* return the template's name without the extension */
    	return "user_table";
    }
}
