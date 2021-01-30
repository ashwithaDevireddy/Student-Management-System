package com.project.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.StudentManagementSystem.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {



}
