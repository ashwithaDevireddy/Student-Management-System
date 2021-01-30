package com.project.StudentManagementSystem.service;

import java.util.List;

import com.project.StudentManagementSystem.model.Student;



public interface StudentService {

Student createStudent(Student student);
	
Student updateStudent(Student student);
	
	List<Student> getAllStudent();
	
	Student getStudentById(long studentId);
	
	void deleteStudent(long id);
}
