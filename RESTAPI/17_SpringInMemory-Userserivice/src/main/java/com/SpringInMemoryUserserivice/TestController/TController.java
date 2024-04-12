package com.SpringInMemoryUserserivice.TestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {
	
	
	@GetMapping("/greet")
	public String greet() {
		return "GOOD MORNING :::";
	}
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome To Spring Security ::";
	}

	@GetMapping("/contact")
	public String contact() {
		return "Welcome To Contact ::";
	}
	
	

}
