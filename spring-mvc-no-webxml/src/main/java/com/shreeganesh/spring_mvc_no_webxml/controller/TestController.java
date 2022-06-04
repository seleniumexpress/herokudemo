package com.shreeganesh.spring_mvc_no_webxml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@ResponseBody
	@RequestMapping("/testing")
	String testing() {
		return "Testinggg.....";
	}
}
