package com.project.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.StudentManagementSystem.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

	
}
