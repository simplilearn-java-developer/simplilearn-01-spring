package com.simplilearn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _02_WelcomeController {

    @GetMapping("/welcome")
    String welcome() {
        System.out.println("Rendering Welcome");

        /* return the template's name without the extension */
        return "welcome";
    }
}
