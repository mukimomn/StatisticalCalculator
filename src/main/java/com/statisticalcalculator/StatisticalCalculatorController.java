package com.statisticalcalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.statisticalcalculator.CalcDTO.SaveCalcDTO;

@Controller 
public class StatisticalCalculatorController {
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	@RequestMapping("/")
	public String index(){
		return "start";
	}
	
	@RequestMapping("/saveCalc")
	public String saveCalc(SaveCalcDTO savecalcDTO) {
		savecalcDTO.setCalcID(1);
		return "start";		
	}
}
