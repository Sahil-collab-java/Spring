package com.SpringJUnit.service;

import org.springframework.stereotype.Service;

@Service
public class MyService implements MyServiceI {

	@Override
	public String getTheGreetMsg() {
		return "Good Morning !!!!";
	}

	@Override
	public String getTheWelcomeMsg() {

		return "Welcome to Junit....";
	}

}
