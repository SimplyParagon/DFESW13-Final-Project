package com.app.qa.main.serviceinterface;

import java.util.List;

import com.app.qa.main.model.Student;

public interface StudentInterface {

public Student saveStudent(Student student);
//saves students
public Student updateStudent(Student student);
//updates students
public List<Student>findAllStudents();
//fetch all students from database
public void deleteStudent(int id);
//deletes records
}

