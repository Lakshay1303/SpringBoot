package com.java.testspring.SectionF;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class studentService {
	@Autowired
	StudentRepo repo;
	
	public List<student>showData(){
		return repo.findAll();
	}
}
