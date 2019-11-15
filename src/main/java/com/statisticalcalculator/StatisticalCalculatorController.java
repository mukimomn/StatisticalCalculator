package com.statisticalcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class StatisticalCalculatorController {
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StatisticalcalculatorApplication.class, args);
	}
	

}
