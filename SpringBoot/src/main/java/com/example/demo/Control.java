package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	
	
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Naveen Kumar!!";
	}

}
