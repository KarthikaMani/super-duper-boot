package com.java.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This file contains the SpringBootApp.java class.
 * 
 *
 * @author KARTHIKA MANI
 * @link http://www.tatacommunications.com/
 * @copyright 2018 Tata Communications Limited
 */

@SpringBootApplication(scanBasePackages= {"com.java.test.controller","com.java.test.service"})
//@ComponentScan(basePackages="com.java.test.controller")
public class SpringBootApp {

	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}

}
