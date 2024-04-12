package com.SpringJUnit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringJUnit.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	private MyService myService;
	
	 @GetMapping("/greet")
	    public ResponseEntity<?> greet() {
	        String msg = myService.getTheGreetMsg();
	        return ResponseEntity.status(HttpStatus.OK).body(msg);
	    }

	 @GetMapping("/welcome")
	    public ResponseEntity<?> welcome() {
	        String msg = myService.getTheWelcomeMsg();
	        return ResponseEntity.status(HttpStatus.OK).body(msg);
	    }
}
