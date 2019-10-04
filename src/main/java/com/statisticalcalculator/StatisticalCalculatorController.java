package com.statisticalcalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class StatisticalCalculatorController {
	
	@RequestMapping("/start")
	public String start() {
		
		return "start";
	}

}
