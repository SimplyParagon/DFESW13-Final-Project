package com.app.qa.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.qa.main.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{
	
	
}


