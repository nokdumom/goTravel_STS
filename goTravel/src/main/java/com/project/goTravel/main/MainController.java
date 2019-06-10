package com.project.goTravel.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="goTravel.do") 
	public String initMain() throws Exception {
		
		return "main/main.tiles";
	}
}
