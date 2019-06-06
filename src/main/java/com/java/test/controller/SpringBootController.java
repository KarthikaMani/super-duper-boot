package com.java.test.controller;

import org.springframework.web.bind.annotation.RestController;

import com.java.test.service.SpringBootService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * This file contains the SpringBootController.java class.
 * 
 *
 * @author KARTHIKA MANI
 * @link http://www.tatacommunications.com/
 * @copyright 2018 Tata Communications Limited
 */

@RestController
public class SpringBootController {

	
	@Autowired
	public SpringBootService springService;
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		
		return springService.serviceHello();
	}
}
