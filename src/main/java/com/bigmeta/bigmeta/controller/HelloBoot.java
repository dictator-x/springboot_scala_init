package com.bigmeta.bigmeta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloBoot {

	@RequestMapping(value="/sayHello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello Boot ......";
	}
}
