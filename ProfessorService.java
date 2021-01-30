package com.project.StudentManagementSystem.service;

import java.util.List;

import com.project.StudentManagementSystem.model.Professor;


public interface ProfessorService {

	Professor createProfessor(Professor professor);
	
	Professor updateProfessor(Professor professor);
		
		List<Professor> getAllProfessor();
		
		Professor getProfessorById(long professorId);
		
		void deleteProfessor(long id);
}
