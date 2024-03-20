package com.java.testspring.SectionF;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<student, Integer> {
	
}
