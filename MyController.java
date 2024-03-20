package com.java.testspring.SectionF;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@Autowired
	studentService service;
	
	@RequestMapping("/show")
	public String callData() {
		List<student>list=service.showData();
		for(student s:list) {
			System.out.println(s.getId()+" "+s.getName());
		}
		
		return "index";
	}
}
