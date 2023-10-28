package com.simplilearn.spring.controller;

import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class _05_CalculatorController {

	@GetMapping("/show")
	String show() {
		System.out.println("Showing Calculator...");
		
		return "calculator";
	}

	@PostMapping("/calculate")
	ModelAndView show(@RequestParam BigDecimal num1, 
			            @RequestParam BigDecimal num2, 
			            @RequestParam String operation) {
		
       System.out.println("Calculating...");
              
       BigDecimal result = switch(operation) {
       	  case "+" -> num1.add(num2);
       	  case "-" -> num1.subtract(num2);
       	  case "*" -> num1.multiply(num2);
       	  case "/" -> num1.divide(num2, MathContext.DECIMAL128);
       	  case "%" -> num1.remainder(num2);
       	  default -> throw new RuntimeException("Invalid Operation!!!");
       };     
              
       System.out.printf("Calculation Completed: %s !%n", result);
              
       return new ModelAndView("calculator","result",result);
	}
}
