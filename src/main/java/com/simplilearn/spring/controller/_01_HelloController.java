package com.simplilearn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _01_HelloController {

    @GetMapping("/hello")
    @ResponseBody String hello() {
        return "<html>"
                + "<body>"
                + "<h1>Hello World Controller Class Example</h1>"
                + "<a href='https://www.google.com/'>Google</a>"
                + "</body>"
                + "</html>";
    }
}
