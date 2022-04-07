package com.app.qa.main.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.app.qa.main.dao.StudentRepository;
import com.app.qa.main.model.Student;
import com.app.qa.main.serviceimplementation.StudentServiceImpl;

@SpringBootTest
public class Service {
	
@MockBean	
private StudentRepository repo;


@Autowired
private StudentServiceImpl service;

Student testStudent = new Student(1,"testname","testaddress");
Student testStudentId = new Student(1,1,"testname","testaddress");

@Test
public void saveStudentTest() {
//arrange
Mockito.when(repo.save(testStudent)).thenReturn(testStudentId);
	
	//act
Student result = service.saveStudent(testStudent);
System.out.println(result)	;
	
	//assert
	Assertions.assertEquals(result, testStudentId);
	
	
	
	
	
}



}
@SpringBootTest
public class Service {
	
	
@MockBean	
private StudentRepository repo;
	
@Autowired
private StudentServiceImpl service;






}



