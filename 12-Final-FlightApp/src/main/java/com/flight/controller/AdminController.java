package com.flight.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.login.Admin;

@RestController
public class AdminController {
@PostMapping("/login")	
public String save(@RequestBody Admin n) {
	if(n.getUsername().equals("user") && n.getPwd().equals("User@1234")) {
		return "login succesfully ";
	}else {
	
	return "invalid credentials";
	}
}
}
