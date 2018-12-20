package com.test.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpring {

	@RequestMapping("/hello")
	public String helloSpringPage() {
		return "helloSpring";
	}
}
