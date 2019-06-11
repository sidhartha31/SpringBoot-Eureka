package com.sidharth.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client-two")
public class DummyController {
	
	@Autowired
	private RestTemplate rest;

	@GetMapping("/invoke/{id}")
	public DummyEntityList invokeClientTwo(@PathVariable("id") Integer id) {
		
		try {
			DummyEntityList dummyList = rest.getForObject("http://client-eureka-one/client-one/getData", DummyEntityList.class);
			return dummyList;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
